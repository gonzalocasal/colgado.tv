FROM ubuntu:16.04

RUN apt update
RUN apt upgrade -y

RUN apt-get install -y apache2
RUN apt-get install -y php libapache2-mod-php php-mysql php-curl php-gd php-pear php-imagick php-imap php-mcrypt php-recode php-tidy php-xmlrpc
RUN a2enmod rewrite
RUN service apache2 restart

COPY . /var/www/colgado

ARG old='DocumentRoot /var/www/html'
ARG new='DocumentRoot /var/www/colgado'
RUN sed -i "s|$old|$new|g" /etc/apache2/sites-available/000-default.conf

RUN echo '<Directory /var/www/colgado/>'>> /etc/apache2/apache2.conf
RUN echo 'Options All'>> /etc/apache2/apache2.conf
RUN echo 'AllowOverride All'>> /etc/apache2/apache2.conf
RUN echo 'Allow From All'>> /etc/apache2/apache2.conf
RUN echo 'Require all granted'>> /etc/apache2/apache2.conf
RUN echo '</Directory>'>> /etc/apache2/apache2.conf
	
EXPOSE 80

CMD /usr/sbin/apache2ctl -D FOREGROUND