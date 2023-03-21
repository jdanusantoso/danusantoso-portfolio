CREATE TABLE users (
	/* All of the columns for our table */
	user_id int primary key generated always as identity, /*generated always as identity -> generate the id when we insert */
	first_name varchar(128), -- customer_name can be a string up to 128 characters long
	last_name varchar(128), -- customer_name can be a string up to 128 characters long
	email varchar(164) UNIQUE,
	username varchar(164) UNIQUE,
	password varchar(256)

	);
	

insert into users (first_name, last_name, email, username, password) values ('Hilliard', 'Gemmell', 'hgemmell0@twitpic.com', 'hgemmell0', '4Jbch0d0IDun');
insert into users (first_name, last_name, email, username, password) values ('Annabela', 'Gurley', 'agurley1@hostgator.com', 'agurley1', 'L8PnaRq3');
insert into users (first_name, last_name, email, username, password) values ('Felita', 'Bingell', 'fbingell2@seattletimes.com', 'fbingell2', 'KvLTm4j46');
insert into users (first_name, last_name, email, username, password) values ('Liva', 'Dulany', 'ldulany3@weibo.com', 'ldulany3', 'sdP9L5AkU');
insert into users (first_name, last_name, email, username, password) values ('Conrad', 'O''Breen', 'cobreen4@nyu.edu', 'cobreen4', 'i0QWPaoA');
insert into users (first_name, last_name, email, username, password) values ('Cheri', 'Larkkem', 'clarkkem5@ucoz.ru', 'clarkkem5', 'eYXbcxPJlJH');
insert into users (first_name, last_name, email, username, password) values ('Boote', 'Kier', 'bkier6@w3.org', 'bkier6', 'mKhSrAzN');
insert into users (first_name, last_name, email, username, password) values ('Shepperd', 'Calyton', 'scalyton7@theguardian.com', 'scalyton7', 'nKpdAc');
insert into users (first_name, last_name, email, username, password) values ('Claudell', 'Gotling', 'cgotling8@netlog.com', 'cgotling8', '2AShTx');
insert into users (first_name, last_name, email, username, password) values ('Kitti', 'Slym', 'kslym9@seesaa.net', 'kslym9', '9xXsIJKR');
insert into users (first_name, last_name, email, username, password) values ('Sanson', 'D''eath', 'sdeatha@123-reg.co.uk', 'sdeatha', 'io44mTz2MMhk');
insert into users (first_name, last_name, email, username, password) values ('Felicle', 'Motte', 'fmotteb@bluehost.com', 'fmotteb', 'JT1QEN');
insert into users (first_name, last_name, email, username, password) values ('Marge', 'Choules', 'mchoulesc@mozilla.com', 'mchoulesc', 'iEg6lqEy65j');
insert into users (first_name, last_name, email, username, password) values ('Renado', 'Joost', 'rjoostd@cmu.edu', 'rjoostd', 'JdxDqw');
insert into users (first_name, last_name, email, username, password) values ('Ottilie', 'Gayton', 'ogaytone@chicagotribune.com', 'ogaytone', 'RlLW0pvNdHH8');
insert into users (first_name, last_name, email, username, password) values ('Ned', 'Enriques', 'nenriquesf@uol.com.br', 'nenriquesf', 'NlhTxZsTyn');
insert into users (first_name, last_name, email, username, password) values ('Margarette', 'Connors', 'mconnorsg@si.edu', 'mconnorsg', 'mTtniseNtfm');
insert into users (first_name, last_name, email, username, password) values ('Chucho', 'Surgener', 'csurgenerh@youtu.be', 'csurgenerh', 'x7eIHnn3');
insert into users (first_name, last_name, email, username, password) values ('Burl', 'Wynn', 'bwynni@kickstarter.com', 'bwynni', 'wpIqlD5hu99');
insert into users (first_name, last_name, email, username, password) values ('Rab', 'Brose', 'rbrosej@google.com', 'rbrosej', 'LzBUS4');
insert into users (first_name, last_name, email, username, password) values ('Felicdad', 'Cattlemull', 'fcattlemullk@washingtonpost.com', 'fcattlemullk', 'gk9a0az');
insert into users (first_name, last_name, email, username, password) values ('Gorden', 'MacMeanma', 'gmacmeanmal@biglobe.ne.jp', 'gmacmeanmal', 'Kn6CiMpE');
insert into users (first_name, last_name, email, username, password) values ('Charyl', 'Leyden', 'cleydenm@weebly.com', 'cleydenm', 'UklWXra7');
insert into users (first_name, last_name, email, username, password) values ('Sybilla', 'Cristofano', 'scristofanon@123-reg.co.uk', 'scristofanon', '5K2eoyh6M');
insert into users (first_name, last_name, email, username, password) values ('Jordanna', 'Standen', 'jstandeno@independent.co.uk', 'jstandeno', 'Tganxq0sX8cF');
insert into users (first_name, last_name, email, username, password) values ('Paxton', 'Dillingston', 'pdillingstonp@loc.gov', 'pdillingstonp', 'bTKVC7');
insert into users (first_name, last_name, email, username, password) values ('Babb', 'Lundberg', 'blundbergq@gov.uk', 'blundbergq', 'Oyn2YUh9c');
insert into users (first_name, last_name, email, username, password) values ('Shaine', 'Gallier', 'sgallierr@unicef.org', 'sgallierr', 'UYuViCUDLUy');
insert into users (first_name, last_name, email, username, password) values ('Donetta', 'Wilstead', 'dwilsteads@1688.com', 'dwilsteads', 'PAV9XOmE');
insert into users (first_name, last_name, email, username, password) values ('Frants', 'Wycliff', 'fwyclifft@last.fm', 'fwyclifft', 'aTmKtHfoFy');
insert into users (first_name, last_name, email, username, password) values ('Law', 'Ricardet', 'lricardetu@nytimes.com', 'lricardetu', 'mNaVpCDWW');
insert into users (first_name, last_name, email, username, password) values ('Tuck', 'Sellner', 'tsellnerv@digg.com', 'tsellnerv', 'dJCZTgUmBqmT');
insert into users (first_name, last_name, email, username, password) values ('Lucilia', 'Bolesma', 'lbolesmaw@paginegialle.it', 'lbolesmaw', '1UrdjPw');
insert into users (first_name, last_name, email, username, password) values ('Kim', 'Dankersley', 'kdankersleyx@deliciousdays.com', 'kdankersleyx', 'YKUpyAP');
insert into users (first_name, last_name, email, username, password) values ('Dewie', 'Basten', 'dbasteny@ehow.com', 'dbasteny', '8nO8pmu');
insert into users (first_name, last_name, email, username, password) values ('Nelia', 'Hubner', 'nhubnerz@globo.com', 'nhubnerz', 'JXBdrny0D');
insert into users (first_name, last_name, email, username, password) values ('Pippy', 'MacIlraith', 'pmacilraith10@yahoo.co.jp', 'pmacilraith10', '0qDk1PB7Mg');
insert into users (first_name, last_name, email, username, password) values ('Taryn', 'Kits', 'tkits11@parallels.com', 'tkits11', 'OsN1hjW');
insert into users (first_name, last_name, email, username, password) values ('Adriana', 'Wooffinden', 'awooffinden12@slideshare.net', 'awooffinden12', 'lQMQG5QGt');
insert into users (first_name, last_name, email, username, password) values ('Normy', 'Liversedge', 'nliversedge13@seesaa.net', 'nliversedge13', 'TKf4tsRH');
insert into users (first_name, last_name, email, username, password) values ('Ezra', 'Wallbridge', 'ewallbridge14@un.org', 'ewallbridge14', '6GscpMJ');
insert into users (first_name, last_name, email, username, password) values ('Mikel', 'Raddish', 'mraddish15@nba.com', 'mraddish15', 'M2WcwgE');
insert into users (first_name, last_name, email, username, password) values ('Arch', 'Gentner', 'agentner16@samsung.com', 'agentner16', 'vHchauQk');
insert into users (first_name, last_name, email, username, password) values ('Pablo', 'Voden', 'pvoden17@slashdot.org', 'pvoden17', 'PkvlDTsuAEI');
insert into users (first_name, last_name, email, username, password) values ('Judy', 'Witherdon', 'jwitherdon18@wikipedia.org', 'jwitherdon18', 'OJarsO');
insert into users (first_name, last_name, email, username, password) values ('Cordy', 'Artis', 'cartis19@chicagotribune.com', 'cartis19', 'EAzJxZls233');
insert into users (first_name, last_name, email, username, password) values ('Tristam', 'Penritt', 'tpenritt1a@webeden.co.uk', 'tpenritt1a', '32NbyjXSd6M');
insert into users (first_name, last_name, email, username, password) values ('Paquito', 'Walding', 'pwalding1b@marketwatch.com', 'pwalding1b', 'OuKRNEj8zr');
insert into users (first_name, last_name, email, username, password) values ('Mata', 'Abreheart', 'mabreheart1c@netlog.com', 'mabreheart1c', 'VVKsRJk');
insert into users (first_name, last_name, email, username, password) values ('Caitrin', 'Westerman', 'cwesterman1d@drupal.org', 'cwesterman1d', '5VN1iIfxi');
insert into users (first_name, last_name, email, username, password) values ('Gill', 'Stroyan', 'gstroyan1e@netlog.com', 'gstroyan1e', 'wobvdH8');
insert into users (first_name, last_name, email, username, password) values ('Shelby', 'Pranger', 'spranger1f@github.com', 'spranger1f', 'Hh1QseSPF');
insert into users (first_name, last_name, email, username, password) values ('Adiana', 'Huban', 'ahuban1g@google.ru', 'ahuban1g', 'pYPZqTJe');
insert into users (first_name, last_name, email, username, password) values ('Husain', 'Yuranovev', 'hyuranovev1h@ehow.com', 'hyuranovev1h', 'LHpD9CoG3');
insert into users (first_name, last_name, email, username, password) values ('Clarance', 'Basile', 'cbasile1i@pagesperso-orange.fr', 'cbasile1i', 'EtiQGn5');
insert into users (first_name, last_name, email, username, password) values ('Ellary', 'Briar', 'ebriar1j@com.com', 'ebriar1j', 'os3qoyUc');
insert into users (first_name, last_name, email, username, password) values ('Cornelius', 'Nutting', 'cnutting1k@jugem.jp', 'cnutting1k', '8TS8EKgs');
insert into users (first_name, last_name, email, username, password) values ('Wallis', 'Ebunoluwa', 'webunoluwa1l@europa.eu', 'webunoluwa1l', 'NHOx0B4LZv');
insert into users (first_name, last_name, email, username, password) values ('Gabriele', 'Lathwood', 'glathwood1m@globo.com', 'glathwood1m', 'NRCDRMXV');
insert into users (first_name, last_name, email, username, password) values ('Hana', 'Bastide', 'hbastide1n@gov.uk', 'hbastide1n', 'Go2gc9M4L');
insert into users (first_name, last_name, email, username, password) values ('Rosaleen', 'Aaron', 'raaron1o@moonfruit.com', 'raaron1o', '5sLb8vbzN5');
insert into users (first_name, last_name, email, username, password) values ('Minnaminnie', 'Shrawley', 'mshrawley1p@hc360.com', 'mshrawley1p', 'Qb39bV');
insert into users (first_name, last_name, email, username, password) values ('Aubree', 'Emblin', 'aemblin1q@google.com.br', 'aemblin1q', 'kWc22KOX');
insert into users (first_name, last_name, email, username, password) values ('Conchita', 'Tomes', 'ctomes1r@prnewswire.com', 'ctomes1r', 'EgoCbO4E');
insert into users (first_name, last_name, email, username, password) values ('Damian', 'Bevir', 'dbevir1s@multiply.com', 'dbevir1s', '2euZNo');
insert into users (first_name, last_name, email, username, password) values ('Winny', 'Manifield', 'wmanifield1t@amazon.com', 'wmanifield1t', 'DLHh5B');
insert into users (first_name, last_name, email, username, password) values ('Donall', 'Bourcq', 'dbourcq1u@unesco.org', 'dbourcq1u', 'Qh0jRovsN62');
insert into users (first_name, last_name, email, username, password) values ('Corabel', 'Rouchy', 'crouchy1v@51.la', 'crouchy1v', 'Du2bVT66n04B');
insert into users (first_name, last_name, email, username, password) values ('Fran', 'Gell', 'fgell1w@toplist.cz', 'fgell1w', 'jv2UYeQbo');
insert into users (first_name, last_name, email, username, password) values ('Price', 'Inglis', 'pinglis1x@japanpost.jp', 'pinglis1x', 'uYFHhlD31');
insert into users (first_name, last_name, email, username, password) values ('Pauline', 'Bondesen', 'pbondesen1y@jigsy.com', 'pbondesen1y', 'ipcc6Sdl');
insert into users (first_name, last_name, email, username, password) values ('Jobey', 'Noblet', 'jnoblet1z@hibu.com', 'jnoblet1z', 'hXxg6kYV');
insert into users (first_name, last_name, email, username, password) values ('Upton', 'Croshaw', 'ucroshaw20@wp.com', 'ucroshaw20', 'fwTrcWA0x');
insert into users (first_name, last_name, email, username, password) values ('Hussein', 'Jori', 'hjori21@example.com', 'hjori21', 'A85dsfm');
insert into users (first_name, last_name, email, username, password) values ('Sarah', 'Giroldi', 'sgiroldi22@indiegogo.com', 'sgiroldi22', 'NO368Cwl2KZ');
insert into users (first_name, last_name, email, username, password) values ('Midge', 'Billson', 'mbillson23@webs.com', 'mbillson23', 'Zidcf8sNcMkc');
insert into users (first_name, last_name, email, username, password) values ('Obadiah', 'O''Donegan', 'oodonegan24@dyndns.org', 'oodonegan24', 'Ud7rRr6pXOQJ');
insert into users (first_name, last_name, email, username, password) values ('Lodovico', 'Roderick', 'lroderick25@virginia.edu', 'lroderick25', 'tawYcc7RNzjy');
insert into users (first_name, last_name, email, username, password) values ('Emogene', 'Vale', 'evale26@geocities.jp', 'evale26', 'nGJvqVhzTpRJ');
insert into users (first_name, last_name, email, username, password) values ('Lilia', 'McCowen', 'lmccowen27@craigslist.org', 'lmccowen27', 'EZ5PQ0ToOmyM');
insert into users (first_name, last_name, email, username, password) values ('Luciano', 'Folcarelli', 'lfolcarelli28@unesco.org', 'lfolcarelli28', 'CQsukOpK');
insert into users (first_name, last_name, email, username, password) values ('Andras', 'Esley', 'aesley29@google.co.jp', 'aesley29', 'gF2KzQ5bZqqC');
insert into users (first_name, last_name, email, username, password) values ('Frederich', 'Marczyk', 'fmarczyk2a@samsung.com', 'fmarczyk2a', 'lnBOD3m386Ja');
insert into users (first_name, last_name, email, username, password) values ('Elke', 'Dyett', 'edyett2b@facebook.com', 'edyett2b', 'ohGW8ySzm8');
insert into users (first_name, last_name, email, username, password) values ('Loren', 'Freeland', 'lfreeland2c@chron.com', 'lfreeland2c', '7YiFNp');
insert into users (first_name, last_name, email, username, password) values ('Sarah', 'Yanin', 'syanin2d@fema.gov', 'syanin2d', 'iARl7v');
insert into users (first_name, last_name, email, username, password) values ('Alexander', 'Dartnell', 'adartnell2e@google.de', 'adartnell2e', 'yXODTmXjna2');
insert into users (first_name, last_name, email, username, password) values ('Kevyn', 'Scragg', 'kscragg2f@shareasale.com', 'kscragg2f', 'hEGLLl598');
insert into users (first_name, last_name, email, username, password) values ('Eydie', 'Frigout', 'efrigout2g@wp.com', 'efrigout2g', 'b2zM9Wmc');
insert into users (first_name, last_name, email, username, password) values ('Cecil', 'McGeechan', 'cmcgeechan2h@guardian.co.uk', 'cmcgeechan2h', 'ZJGAN3n9KWma');
insert into users (first_name, last_name, email, username, password) values ('Monro', 'Mackleden', 'mmackleden2i@skype.com', 'mmackleden2i', 'GGmLHHZc4v');
insert into users (first_name, last_name, email, username, password) values ('Fidel', 'Whyffen', 'fwhyffen2j@amazon.de', 'fwhyffen2j', '9gymzF');
insert into users (first_name, last_name, email, username, password) values ('Alejoa', 'Frie', 'afrie2k@businessweek.com', 'afrie2k', 'tK85OzPB');
insert into users (first_name, last_name, email, username, password) values ('Sherilyn', 'Corbould', 'scorbould2l@vkontakte.ru', 'scorbould2l', '52KaNqdMqKY');
insert into users (first_name, last_name, email, username, password) values ('Arv', 'Tulloch', 'atulloch2m@loc.gov', 'atulloch2m', 'hVNBuYE9');
insert into users (first_name, last_name, email, username, password) values ('Natal', 'Niese', 'nniese2n@yahoo.com', 'nniese2n', 'gPVV3eS');
insert into users (first_name, last_name, email, username, password) values ('Angy', 'Eddis', 'aeddis2o@timesonline.co.uk', 'aeddis2o', '4uoiFhfRjEl');
insert into users (first_name, last_name, email, username, password) values ('Starr', 'Luna', 'sluna2p@goo.ne.jp', 'sluna2p', '5e7xs7Ew');
insert into users (first_name, last_name, email, username, password) values ('Garey', 'Dimitru', 'gdimitru2q@usa.gov', 'gdimitru2q', 'MVKAy2VX');
insert into users (first_name, last_name, email, username, password) values ('Hasheem', 'Rayer', 'hrayer2r@columbia.edu', 'hrayer2r', '0dpDFkEQYEDS');

CREATE TABLE movies (
	/* All of the columns for our table */
	movie_id int primary key generated always as identity, /*generated always as identity -> generate the id when we insert */
	title varchar(128), -- customer_name can be a string up to 128 characters long
	genre varchar(128), -- customer_name can be a string up to 128 characters long
	releaseYear varchar(4), 
	int price varchar(128)
--	order_id_fk int references movies(movie_id) not null

	);

	insert into movies (title, genre, release_year, price) values('ambulance', 'action', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('the batman', 'action', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('the lost city', 'action', 2022, 14.99  );
    insert into movies (title, genre, release_year, price) values('everything everywhere all at once', 'action', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('the contractor', 'action', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('the northman', 'action', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('doctor strange and the multiverse of madness', 'action', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('the roundup', 'action', 2022, 4.99 );
    insert into movies (title, genre, release_year, price) values('top gun: maverick', 'action', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('jurassic world: dominion', 'action', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('bullet train', 'action', 2022, 19.99 );
   
   	insert into movies (title, genre, release_year, price) values('uncharted', 'adventure', 2022, 6.99 );
    insert into movies (title, genre, release_year, price) values('free guy', 'adventure', 2021, 19.99 );
    insert into movies (title, genre, release_year, price) values('moonfall', 'adventure', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('dune', 'adventure', 2021, 14.99 );
    insert into movies (title, genre, release_year, price) values('ghostbusters afterlife', 'adventure', 2021, 14.99 );
    insert into movies (title, genre, release_year, price) values('spiderman no way home', 'adventure', 2021, 14.99 );
    insert into movies (title, genre, release_year, price) values('morbius', 'adventure', 2022, 6.99 );
    insert into movies (title, genre, release_year, price) values('no time to die', 'adventure', 2021, 19.99 );
    insert into movies (title, genre, release_year, price) values('the secrets of dumbledore', 'adventure', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('the bad guys', 'adventure', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('eternals', 'adventure', 2021, 9.99 );

 	insert into movies (title, genre, release_year, price) values('jackass forever', 'comedy', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('marry me', 'comedy', 2021, 14.99 );
    insert into movies (title, genre, release_year, price) values('i want you back', 'comedy', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('dog', 'comedy', 2021, 19.99 );
    insert into movies (title, genre, release_year, price) values('turning red', 'comedy', 2021, 9.99 );
    insert into movies (title, genre, release_year, price) values('the unbearable weight of massive talent', 'comedy', 2021, 19.99 );
    insert into movies (title, genre, release_year, price) values('my senior year', 'comedy', 2022, 7.99 );
    insert into movies (title, genre, release_year, price) values('chip n dale: rescue rangers', 'comedy', 2021, 9.99 );
    insert into movies (title, genre, release_year, price) values('a perfect pairing', 'comedy', 2022, 7.99 );
    insert into movies (title, genre, release_year, price) values('the adams project', 'comedy', 2022, 11.99);
    insert into movies (title, genre, release_year, price) values('fire island', 'comedy', 2021, 13.99 );

    insert into movies (title, genre, release_year, price) values('luckiest girl alive', 'drama', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('amsterdam', 'drama', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('Tár', 'drama', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('blonde', 'drama', 2022, 11.99 );
    insert into movies (title, genre, release_year, price) values('grimcutty', 'drama', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('the woman king', 'drama', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('triangle of sadness', 'drama', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('the banshees of inisherin', 'drama', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('significant other', 'drama', 2022, 14.99 );
    insert into movies (title, genre, release_year, price) values('the greatest beer run ever', 'drama', 2022, 10.99 );
    insert into movies (title, genre, release_year, price) values('where the crawdads sing', 'drama', 2021, 19.99  );

    insert into movies (title, genre, release_year, price) values('halloween ends', 'horror', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('x', 'horror', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('watcher', 'horror', 2022, 12.99 );
    insert into movies (title, genre, release_year, price) values('midsommar', 'horror', 2019, 9.99 );
    insert into movies (title, genre, release_year, price) values('dashcam', 'horror', 2021, 14.99 );
    insert into movies (title, genre, release_year, price) values('hereditary', 'horror', 2018, 9.99 );
    insert into movies (title, genre, release_year, price) values('halloween', 'horror', 2018, 14.99 );
    insert into movies (title, genre, release_year, price) values('nope', 'horror', 2021, 19.99 );
    insert into movies (title, genre, release_year, price) values('jeepers creepers reborn', 'horror', 2022, 7.99 );
    insert into movies (title, genre, release_year, price) values('hellraiser', 'horror', 2022, 10.99 );
   	insert into movies (title, genre, release_year, price) values('doctor sleep', 'horror', 2019, 14.99 );
  
	insert into movies (title, genre, release_year, price) values('a star is born', 'romance', 2018, 14.99 );
    insert into movies (title, genre, release_year, price) values('call me by your name', 'romance', 2017, 13.99 );
    insert into movies (title, genre, release_year, price) values('bros', 'romance', 2022, 19.99 );
    insert into movies (title, genre, release_year, price) values('the vow', 'romance', 2012, 13.99 );
    insert into movies (title, genre, release_year, price) values('la la land', 'romance', 2016, 7.99 );
    insert into movies (title, genre, release_year, price) values('crazy rich asians', 'romance', 2018, 14.99 );
    insert into movies (title, genre, release_year, price) values('emma', 'romance', 2020, 9.99 );
    insert into movies (title, genre, release_year, price) values('after', 'romance', 2019, 14.99 );
    insert into movies (title, genre, release_year, price) values('her', 'romance', 2013, 7.99 );
    insert into movies (title, genre, release_year, price) values('persuasion', 'romance', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('father of the bride', 'romance', 2022, 19.99 );

    insert into movies (title, genre, release_year, price) values('interstellar', 'scifi', 2014, 14.99 );
    insert into movies (title, genre, release_year, price) values('blade runner 2049', 'scifi', 2017, 9.99 );
    insert into movies (title, genre, release_year, price) values('arrival', 'scifi', 2016, 14.99 );
    insert into movies (title, genre, release_year, price) values('annihalation', 'scifi', 2016, 7.99 );
    insert into movies (title, genre, release_year, price) values('spiderhead', 'scifi', 2022, 8.99 );
    insert into movies (title, genre, release_year, price) values('life', 'scifi', 2017, 13.99 );
    insert into movies (title, genre, release_year, price) values('prey', 'scifi', 2022, 9.99 );
    insert into movies (title, genre, release_year, price) values('tenet', 'scifi', 2020, 14.99 );
    insert into movies (title, genre, release_year, price) values('the invisible man', 'scifi', 2020, 14.99 );
    insert into movies (title, genre, release_year, price) values('synchronic', 'scifi', 2019, 6.99 );
    insert into movies (title, genre, release_year, price) values('ex machina', 'scifi', 2014, 9.99 );

	insert into movies (title, genre, release_year, price) values('1917', 'war', 2019, 14.99 );
    insert into movies (title, genre, release_year, price) values('operation mincemeat', 'war', 2021, 10.99 );
    insert into movies (title, genre, release_year, price) values('midway', 'war', 2019, 12.99 );
    insert into movies (title, genre, release_year, price) values('the king', 'war', 2019, 10.99 );
    insert into movies (title, genre, release_year, price) values('dunkirk', 'war', 2017, 14.99 );
    insert into movies (title, genre, release_year, price) values('hacksaw ridge', 'war', 2016, 12.99 );
    insert into movies (title, genre, release_year, price) values('13 hours: the secret soldiers of benghazi', 'war', 2016, 14.99 );
    insert into movies (title, genre, release_year, price) values('fury', 'war', 2014, 13.99 );
    insert into movies (title, genre, release_year, price) values('war dogs', 'war', 2016, 7.99 );
    insert into movies (title, genre, release_year, price) values('12 strong', 'war', 2018, 14.99 );
    insert into movies (title, genre, release_year, price) values('a call to spy', 'war', 2019, 14.99 );


