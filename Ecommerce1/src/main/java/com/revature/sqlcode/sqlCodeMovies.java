package com.revature.sqlcode;

//public class sqlCodeMovies {

//[{
//      {
//        "title": "Ambulance",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYjUyN2VlZGEtNGEyZC00YjViLTgwYmQtZDJiM2FlOTU3Mjg2XkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi55427865/1434659607842-pgv4ql-1648138320884.mp4?Expires=1678063154&Signature=Q19OpL0lvfet~EcfYbQbuL431Vo5-hm6sYeAf5L4MVFcgapTxtZN0ftIi3cpUe8emi29QnFFz5-~wZlbQN9BlFMfddS6wBDn9DC8RQWe8lrnOSjE-TXVDmNWEVEOb2dF7IbLLDn3OJkNQsEufIoyqf1MS5CiITu~oI6n6QR5RfJYhrgNyIV79fem5YbF8TMwz4pAGDYtWcjaxzIiczFFtAlZ0yJ2CiwKeTw9H~-tKFUthj9Tzhk8t-ZzGiAfzQ8M7E5BiyOjIp3M-cbOCfRqLKqUc~N2zWkCVDrcRNqSPBvUecF8YFdm8SnVq8RHMVMfX6KAQImmCqshPmOcjnKJ2w__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "Two robbers steal an ambulance after their heist goes awry.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//        "title": "The Batman",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMDdmMTBiNTYtMDIzNi00NGVlLWIzMDYtZTk3MTQ3NGQxZGEwXkEyXkFqcGdeQXVyMzMwOTU5MDk@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3215114777/1434659607842-pgv4ql-1649797798432.mp4?Expires=1678063561&Signature=fP~0xHXJv56yCNdCa9Mg548iX3YZOMMdZtnOe9RKEgcteXGLaOG0c80Gva5KZ7SXQHyZLGHHNBnSYGR4VB7N3J~2jKMQ4JIfwPyQUZ0~It9Sk~pqQhtO2-G-8OmOEtfhMB4idHJRtLG11OXvEOv7-6KOTXtKjDNM5EUaXxVuEiSevmHkMfw7rPBLkWOg~N9~KgIzA5tnhmDdq3PooPZpBt4Sb1u4Lbbmn4o3fHJK2D4xsgO9wFOw5HxMRdQFHMQcCdCUw6ChnEnLoxtcRewyUOk-YP1l5ps2auTKPyqhnMllvgQA7wDkzD2tlWovH1gyRzVe45gkCKQLmToKyyj~~w__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "When a sadistic serial killer begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//    "title": "The Lost City",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMmIwYzFhODAtY2I1YS00ZDdmLTkyYWQtZjI5NDIwMDc2MjEyXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3826238233/1434659607842-pgv4ql-1644513371584.mp4?Expires=1678063656&Signature=n-x25yRhkZsntSxQXDPkokTvzm6YapUJlQMYA8DzOv3prmzqXr14qZjdGPV9zQ2U7l7c1jPYO94Q-QOosFR40vLYDij84DkbM5QSnr0c5MlcURAEjdrocJP9bWUxmmrRUMf3pZhdnw6qfxx3hkDYs1pL3vbYYF-dSsQJCF2XwnUPplL8QZvJ9AlM8Qq4aJR7i0KFp6B9ShHM-UxbKaAu~ECx1hntjmoO0KuAuyqG7951XbTMxSl3jnZ1BB11ISung1bXqPKlsFWGh7IkPUt63KWwYVnbdHn0zb3o~MMqUoy~4QBMbMqe3PLVG5oMJXSn8eYPgFgWSdq2yfUn1xvj6g__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "A reclusive romance novelist on a book tour with her cover model gets swept up in a kidnapping attempt that lands them both in a cutthroat jungle adventure.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Everything Everywhere All at Once",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYTdiOTIyZTQtNmQ1OS00NjZlLWIyMTgtYzk5Y2M3ZDVmMDk1XkEyXkFqcGdeQXVyMTAzMDg4NzU0._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1708573209/1434659607842-pgv4ql-1655379584923.mp4?Expires=1678063404&Signature=Jdvd-1U6WT68~lViD~Bjvr95fIUOoRWk3bN45mK~I4dx-fFBJ2Ir3jYAKIQytqhqQt7j28s0M0eRcxZQNqw4sfkFnXFSinpNCP8lkzGzPCNg-7q~WqgxPka2suTrVvEH6mxnD0dYc0X~4XNBwAO8it7InPEjjPwAdK-nsEBd1Rt9Ikw5HfL4jkdb1ii3QYWcACF1l1CvuPp3p~Un9F06AKJUs1u9Xr0YHbyTvbF2i1IJO1SRlMONOvPriFU5JVYaTGHGkLuHw4WMd7JGv-hpOG2afDdIZG47fGho7WL84fdoS6UMtWUgIR8kClg3V8kpllC6JeaGLT78DJFRJerBuw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "A middle-aged Chinese immigrant is swept up into an insane adventure in which she alone can save existence by exploring other universes and connecting with the lives she could have led.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "The Contractor",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOWQ3MDg1MTgtMmI4ZC00YjU3LWIyZGEtNmRkNzI0Y2QyN2ExXkEyXkFqcGdeQXVyNzgzODI1OTE@._V1_QL75_UX190_CR0,0,190,281_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2179318297/1434659607842-pgv4ql-1654275834485.mp4?Expires=1678063815&Signature=kVVDYS0rqdPgxWf8KahvrbzcPSIKLU5yR8bgfuwBoYZGkFxnDv-5aUMB~BSuHAujGY9LaAT6paoNhkJxBVonZ-dYn6EU7UlWPX0wrwxsRWJJBhI549UB-DAGfQEsGqGzlj7ADEu4Kcpytbgfoou-Nk5s5A7Ce262NLg3XaadY1Y1uL9T0FefPIq2um2E7D7aGwWbVqcSIvZ0uOEUFJ8p6eXXVUHE61bwBlyHioseo66SzdgwSKfmjMvgoyvvASNQcWjVmUyP8buxp1QStIIy8bC4G7vPg5Osut4JfBPhXfq7IJLnId7Gly2dalBk6qQKSpe~P~am06CM6-BcUuNAIw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KAA",
//        "genre": "action",
//        "description": "A discharged U.S. Special Forces sergeant, James Harper, risks everything for his family when he joins a private contracting organization.",
//        "releaseYear": "2022",
//        "price": 9.99
//}
//
//{
//       "title": "The Northman",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMzVlMmY2NTctODgwOC00NDMzLWEzMWYtM2RiYmIyNTNhMTI0XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2628633113/1434659607842-pgv4ql-1650564160409.mp4?Expires=1678064490&Signature=UeatmQMyDqcYKmgeP-CjvHYl5XB256-Gvt310NHkUztnwtOBHRGTzt7vtNOTRS-EGOA3NmMB2FuxA3qLgYfkVwweCXXb7rGCy-6XpDRF4fqti4AGrRlISUl1phHcwXxDHMCL5kT6Ln1mi97i8aDzMAJDh7jYS1BOtRWQtyKiQcXF2bYu3I~SIHkhidnTCaxfr95p~RgxRIdiDi5FLLVhBjPxKkW3tCN-sCeoqenfkL5pS~fPN6MOgg8TD5ncfILEaVRF5IAWJ3ziwdd-gq2tn-lDJZSP0Y4JJGAQCpS9AXWnsHCmqPARj6xIRjJuXpBbkF5CbVNoqpR~RtUHfuidlQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "A young Viking prince is on a quest to avenge his father's murder.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Doctor Strange in the Multiverse of Madness",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNWM0ZGJlMzMtZmYwMi00NzI3LTgzMzMtNjMzNjliNDRmZmFlXkEyXkFqcGdeQXVyMTM1MTE1NDMx._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1050657305/1434659607842-pgv4ql-1651759497734.mp4?Expires=1678064699&Signature=XHoMPOGW62NrN8HahRhSMwvpdB6pbE2ciYk~23SH6NxoVB6G2FcvCfNtcYW55CN7FNyQyOUIVfyD03rjOuz5XkqdIjzvq-8DcZ14JxOM~bH88bE-OsQ3GvnBnkPa5HRH9kovWZGfUis4enfHvCb2urZ0Fwkz8sqbaENdIuWmFxmSy2PXiB6zxJTrDo-KdmI1IVuTe4WE5qhDHMS32QI4tXp7c4l3hVdTGW0Zq2TopjsETUf1214jwqJ6oqNh1er~VpgpYSWOEZMrvPAdeWBrj7mbl3yGKRQRGI4aFNe~nzuBtxHOac9h~rc3Gz31cYU2MgCMSkeabLSXGktW4gOpmQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "Doctor Strange teams up with a mysterious teenage girl from his dreams who can travel across multiverses, to battle multiple threats, including other-universe versions of himself, which threaten to wipe out millions across the multiverse. They seek help from Wanda the Scarlet Witch, Wong and others.",
//        "releaseYear": "2022",
//        "price": 9.99
//}
//
//{
//       "title": "The Roundup",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTE5YzcyOGUtOWRkZS00YzQ0LTkwOGQtMmQ2NzcxY2M2MGQ0XkEyXkFqcGdeQXVyMTQwODg1NTU3._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi754041369/1434659607842-pgv4ql-1652975596917.mp4?Expires=1678064421&Signature=KNEBPVfQ7ws2T3oIubWJN6A~rywp3LKYbYfVgiW7bn~1HpbJlTHbNT15ukB0oN3bsa8GehHvYKiyPGCkiNovhmojRdmEoNSoB9xlnhXbGQVE3YsaVvxmqAfppKpo8tts6WUAMEX-b4jBTeBLRTSwxX~C1dAz~b5gttAXTQJQCNzGwXKXvQc3GsvVqaqzW2~yIrc0711xGCSbxL6nFrB9TsteDoFUChAWSKuHiTmuT9CeWJdr5WHyKbxF2PgDOwJnL2xuHavcNTQzuf9DP2ptTmCBf~gqnMhPuOJ134INGR2MqvdUCkdAu7vKad0clXfg7UQj8Z69MwwXRplon0~hPw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "Followed by Ma Seok-do, who heads to a foreign country to extradite a suspect. However, he discovers additional murder cases and learns about a killer who had committed crimes against tourists for many years.",
//        "releaseYear": "2022",
//        "price": 9.99
//}
//
//{
//       "title": "Top Gun: Maverick",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTBjMjA4NmYtN2RjMi00YWZlLTliYTktOTIwMmNkYjYxYmE1XkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi764854809/1434659607842-pgv4ql-1651159417077.mp4?Expires=1678065169&Signature=js6fyAnOEm9XvoAJUJ~19NcXsY0Jh37bDIwxwCBD0zosXkysfuTZH0tEZzjOEZz7ksyxqylfMxJo3TSgjLagjsFD~5rpUDd4Z~ZMdjhGERFs0wyae8cWfx-L2k4hu0YB1Tg14k3wvnANpUlrSMLTqWrTzGCNv5L4wDB09UBwhv0wHzpauktB~L0U8-Ng7Z7aGFgR3H0XoXR6lqs9rAB7jeO9KXcTC4H7wfNvu4hZtHOSQ6h0hRfW8H8lr6NYm7L4QRBvElQJEDBOh4tU2dVF~Ci82VFvfMJhfSeapxM1IOTyw6B~rXDLl7RIxiMf~ObEc8cEasFY03R-nHq2nrmNFA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "Four years after the destruction of Isla Nublar, Biosyn operatives attempt to track down Maisie Lockwood, while Dr Ellie Sattler investigates a genetically engineered swarm of giant insects.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Bullet Train",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMDU2ZmM2OTYtNzIxYy00NjM5LTliNGQtN2JmOWQzYTBmZWUzXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1743438361/1434659607842-pgv4ql-1654615953314.mp4?Expires=1678064815&Signature=K29q7~yJ61lAJHCdU9IW5xjPXocvZVSkrll5LSW0EtIC9~CxnEyUcX95LFyKZBvjJdiv3TAVme6bOXhk39ErFWeVFE4OoZvPltJoYyqFw9MEOpxN2X0dtGaCY1FUJjmV2RN2PiNgfhVy-ASCqrzVMPyBvSrDv-e4kZSRp8DS-NEWybFREISwhdUxeekTEbA4geVmuANaZvk~QCxOFRLMS7eTo8rQMhZg0rqT6g8FIO48C2bVwXt3kHlWDn5HBky3xTzf1EL3S6D-jvE6f3qR6MWp~u-z4hKoFH1p8AAWYwmABLScTPVbiKvb0PflYRworhK7LtGAv34IOp3pFx6VlA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "Five assassins aboard a swiftly-moving bullet train find out that their missions have something in common.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//___________________________________
//
//{
//       "title": "Uncharted",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMWEwNjhkYzYtNjgzYy00YTY2LThjYWYtYzViMGJkZTI4Y2MyXkEyXkFqcGdeQXVyNTM0OTY1OQ@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi420201241/1434659607842-pgv4ql-1644274969357.mp4?Expires=1678065624&Signature=F-NUlfIMDkDmExIG1ee0TJbta6S1ynOFkxZEmPrTKVanfXnqU9DZPto6LAm~88RJa-crBfduH8djjFfea1YRKPOZbz6R5YI1zLz-aOz9ee12PVFhFmgPq2RBzmPernzsNtN2z0R5hETlOnwpxR~4tywQcQ4aaSby4-EuBiTZ1EtVyvkE13q0OxEAx1nOh9zZDNiBB1EduG~r3KSk7gtGWUUQoXURfgqcNuv6NhGSLRBSu0rXmc7r4v5cf7xv2HYm~84sE4T2vws69R~ZX9uL-SeXP8dZPBW4oDZQ6lzEcIe3sqC-ARyZJvWTyNCtNcv~kerYWCxrgPw611YY-UPXSw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "Street-smart Nathan Drake is recruited by seasoned treasure hunter Victor 'Sully' Sullivan to recover a fortune amassed by Ferdinand Magellan, and lost 500 years ago by the House of Moncada.",
//        "releaseYear": "2022",
//        "price": 6.99
//}
//
//{
//       "title": "Free Guy",
//        "moviePoster": "https://m.media-amazon.com/images/I/71KhuB7slFS.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3038887961/1434659607842-pgv4ql-1623337674198.mp4?Expires=1678065754&Signature=qn3NaxxxZXg8Nfp89d0KnPeXXT0ZOJWZ0cKZzCby3~Kx-AGYyq46UrosAKbvJsufW7U~CItiuFX~EHao8jM4-Oih9dAEqjkMlbdmGzKKA1PGw8Fga0k8VEH2UmjAKMxcHJxWpYh7R2KO~Y1~REycNvObz2~AI9muf-pdSxL5EU2FnCE10j6ABFXbIy33ogQuC7N3RNUvItm9Pk-6PXO3u2ylLw51739xFcWp4cq7kICoU4Y7AkwRBakE8RW8KIppt5Q3dOPUsDRg5MwF0C3aXm8XI~L946fuy1dS~32BTG~~Zgb8z~hQ2qNDF58H3QFYj1EituccQlS~Ijr2Y2QJ9w__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "A bank teller discovers that he's actually an NPC inside a brutal, open world video game.",
//        "releaseYear": "2021",
//        "price": 19.99
//}
//
//{
//       "title": "Moonfall",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BZjk0OWZiN2ItNmQ2YS00NTJmLTg0MjItNzM4NzBkMWM1ZTRlXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3862676249/1434659607842-pgv4ql-1641485425691.mp4?Expires=1678065468&Signature=d8gUF~XlWAtf~O60vpTWXY4lt9SLnFNJAlf1C2Wrbicx3WrRh4EjUkHWYdpNJbJMhA4diJxZm4rbXsLOLQom5M1E5L4zO6vazkh60MMLM-JLPJaGqgmxdHuBcLXuiGZJ4A2uImjmbURj2Uuwh6LwG9fLaDCNVDUTFCQD64oG63giBRwzEzB6hMKVe3x5IEHGJ8wqgIWytskmm~TkdZkpF8DD4Ac6HSmmbWgbjgPdfudykOtEJu7qHcuClRsGfP6kUApJxvGBdUFrp9h8sXtf-XOCqkdK3FEu-MoI6FMf2dsiPLDNcVNcV6z5C7UpM-73zPrdKyb9NosOcxEcCLUMdg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "A mysterious force knocks the moon from its orbit and sends it hurtling on a collision course toward earth.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Dune",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BN2FjNmEyNWMtYzM0ZS00NjIyLTg5YzYtYThlMGVjNzE1OGViXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3986080537/1434659607842-pgv4ql-1633625495700.mp4?Expires=1678065575&Signature=eh1dqRm~QbcjP8F7qPbAnoWxvMiAq5PjTuRWunWztdoqqqlO5xc2JXMBTcF1sHuhrd8KhqrQ4jpuIHjSX2HaU8M1ojhtqyvKhnEL~Vn-m9Ft2VNAVIvEMve~w5Jvs2uNoKiNANVCYBK~DfZjkACK1FAuCc-1SmrkU2DPb6Q2xfWAEoh4aNkVVngHougRw4uaQaJvGnJpqxm~cxUKgDKud4sNeT-hzmuShBUAAX3rPS5elNRJ~KT7fMTDqUTMFCCuxcvt-r5zZFDu1U53Qeat63RBlD7K-jidN2KwXqewAHPdm3o5GKWCUyH6cvpxcl3X~awq8wFeJts1OkW5z125zA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "A noble family becomes embroiled in a war for control over the galaxy's most valuable asset while its heir becomes troubled by visions of a dark future.",
//        "releaseYear": "2021",
//        "price": 14.99
//}
//
//
//{
//       "title": "Ghostbusters: Afterlife",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMGY2NjUwODEtMGM5OS00MzhkLWEzYTUtYjkwMjFmNjhiN2FmXkEyXkFqcGdeQXVyMjMwNDgzNjc@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi637322009/1434659607842-pgv4ql-1636394544564.mp4?Expires=1678065763&Signature=raA44XZdPfCDbwHe34OXskGQCGJEWaLsTJLDS2x5dvyoUihbVN77L3UeLf8q4lSAtnapPdQXDtuGgXWBQMfYwrcPzxitQcg9ENjyMfrUEVRY1bWH3sHLCEU8fXYIiiR6kKlTro-6U9lnhtY0qu~2DXFCiMwtJhvx0i4YRZ~ybB6u41gtWlZJOl7ubyize72ttmYM~qtkOJfduKfhKHh7MCf3QbxJIft3bs2tbT6QaygjZIby1NWmoG4Ts~C0fOKqtpyjo~0pP2Vsryzr7LXEvAoqM1NiQoykp5nz8nmBZBx1QaDK~Ogs5OHTZi1VkAROlmvk4abAYba0bgK7ShfPmQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "When a single mom and her two kids arrive in a small town, they begin to discover their connection to the original Ghostbusters and the secret legacy their grandfather left behind.",
//        "releaseYear": "2021",
//        "price": 14.99
//}
//
//{
//       "title": "Spider-Man: No Way Home",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNmM1NTY3NzYtOTQzZi00NmFjLWFjOTUtM2E0MjIxYWU2OWNkXkEyXkFqcGdeQXVyODIyOTEyMzY@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3348546073/1434659607842-pgv4ql-1651186731527.mp4?Expires=1678066170&Signature=H2i0RYPHwJ-~eCh54ZpxV67yHT0xMA-YkGYEziYzJtmlcqwACBcFBgMRZcDuOieO2u0hZWSpfhcSMRa7swz6XmKS6B64BQK27ZW1ozx0RDBC3~xpzHokYeZWhfrCQeUoXc52T2AzbGF-UwmU-v~VpQVZF72kQMOSO5NRywdbqqZiXqJVZAI02VXRLnE8kg7s4qQVBjWuqGDW4oIq~gb4ZW22ffuhTbGHxSsUVh8CUF3KPrrvS5MHtrFjhOfyCzNKYUNfRj9Wg4fpsh38bVFWQ0fH7XuKEKn7-nYTYFiQoRcGW2piJrFfDG9ykv6qsQ-ZiU5LR7CEsK6QrB4H5-aGhg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.",
//        "releaseYear": "2021",
//        "price": 14.99
//}
//
//{
//       "title": "Morbius",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNTA3N2Q0ZTAtODJjNy00MmQzLWJlMmItOGFmNDI0ODgxN2QwXkEyXkFqcGdeQXVyMTM0NTUzNDIy._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi862765849/1434659607842-pgv4ql-1646057736250.mp4?Expires=1678066470&Signature=UobpjP6uDG9Dh2TWdjPJEWiBRGVwln~flzZaiAx~tDGpzNOoZJpjw~z9tmZxtTZj~bAvtvtJeXwE9vXQEBwltnWXR3XcbX-uWfP-YCPFyhwJJsVv3OB9WVtOu4L~TXykZaphx6TVE1Zj7zUsmqsaGzT9OXc7CQQ4QiSJrwP6jOha3VWeNBos8bC1Qh56-BRQU0USTZgr0FJfR60K50q7PYXC7kvRDKUTVx6ZnMjBi66ZbmfbQnW8i02FJ2yQ82XXUvty4VL-SDZMLu4bZmEiNYMGJVKZA0ewrXxqvNwU9LeHnRdmwWZtK0W-wz58JZoXhjGI7y-0wzUKKj0mM02Waw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead.",
//        "releaseYear": "2022",
//        "price": 6.99
//}
//
//{
//       "title": "No Time to Die",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYWQ2NzQ1NjktMzNkNS00MGY1LTgwMmMtYTllYTI5YzNmMmE0XkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3903767321/1434659607842-pgv4ql-1633039814981.mp4?Expires=1678066413&Signature=jHv1fGRcXRmS9sg0MHPssWKcvsJPOCUaNptWEwXyOjJd1UeyZ9rId6ZmEvJZCdWx7wYoDF-alMRQrP8~I0tbau79C89Vz-TsuER9XTWlWi4Q~K7x07rVTBm4QZE4CrxAzHIh~~gDYQYfEfFr1kkqfiw~SC--TA30QZ5itOSjmypT0hGowsP2Aj90B6Amy5m9v41dRtw4ws7xzqM3KcmN4YqSlsjrD6zW0MQmpoUUyCM1RaX2ir-yQzyn2X5A8gOc-mVLEBD4yQ80mBI9VLwdrZP95UHqv6t1vkH88RGmwup4tgQDLnsDvEnzRoLl3h5xyx7lybg~d14BDh7JGcQalg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "James Bond has left active service. His peace is short-lived when Felix Leiter, an old friend from the CIA, turns up asking for help, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Fantastic Beasts: The Secrets of Dumbledore",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BZGQ1NjQyNDMtNzFlZS00ZGIzLTliMWUtNGJkMGMzNTBjNDg0XkEyXkFqcGdeQXVyMTE1NDI5MDQx._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2158019097/1434659607842-pgv4ql-1649696165128.mp4?Expires=1678066613&Signature=dGdwWA9nV1vcOS-1L9eNVsDYgBxdaynSkBZpA9rGqz8Pu1f6mynRDH49m3BxoiAemiD8POHiW-v1JRZw26XDI81BiF8MaVntWCrDicZuLnpI8ZwDYFZSwqjLlUfndKiuvdy1QTKaMBW8Mm668CWeVwyrTZHiVnB8JQNaER96ONBz6HdYf4EQoEqnF2l0Tayt1xtgFZID6cggvsyGXePE6e~OauWHmQfFAHsZ6q9EDW2cSo43Ri2wBooF2o3a6x~KFV4eK0ZqzqcipTBvBpmGHP1V5G56~d69KVAAEEkmbHclxnLOu~D9jkKGTPTix3rJ43rE6gz8-RNhw9H7EB8HYg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "Professor Albus Dumbledore must assist Newt Scamander and his partners as Grindelwald begins to lead an army to eliminate all Muggles.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "The Bad Guys",
//        "moviePoster": "https://upload.wikimedia.org/wikipedia/en/0/00/The_Bad_Guys_poster.jpeg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1080345369/1434659607842-pgv4ql-1645633618871.mp4?Expires=1678066720&Signature=OVPGBl0TXmTOyOE8jvJUwdqZJiiRBz3wTEIOUu5A5-iE6fFqj8o59JQdfjZaAeU0nO11vgjkYGMzX-J0qusUecQxLN0OR96GVZH8lpm-FC-VxC1tYDguR5LPYYmDncqQ785AWvWVSe-4xN-PwAp~vxRl58rZKMMCz2qM-7p9PCBgLk1BP4mB-W~t-vzZgmSW3wkUZUQM2~Idl4am88LEqw7NbhZQ9No79geWwTCMmu8Zy0NsNbRCi4v6x8Qt3ugwVU5uc-HCUIvVxHiLrjw~kYGh7yl~GWqFBWJQq30E9i3L8LY8ixysLC1wB~Ns1t2JGWFppc~1YGGeLe5xYDytpQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "To avoid prison, a gang of notorious animal criminals pretends to seek being rehabilitated, only for their leader to realize that he genuinely wants to change his ways.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Eternals",
//        "moviePoster": "https://m.media-amazon.com/images/I/61+uuv06fQL.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi294503193/1434659607842-pgv4ql-1635265075529.mp4?Expires=1678067389&Signature=mlRa1ASzdtQr4CZf5ZTzU1KhQOJWYteA8VNXN9a-1pC2ICUvQuS1IZhVpi2V2dcNL1w2OwX7Im76-MG5nAOhaGRGMF95tilKxQTMlafsE0ZKxywJ1OifL9c~hAemmuFefNr8y-F1CRsuhmFEpKbMmZz4NNPtViVrjewfitT4BLoe0X30TEfUNMTzxyVGCliyNc~WIXl1t0ohsOYvBdmn7jyDAABDUaqWXsdz8mLz6~RvvqlQ5kIdv3Q87bD6zWCe7koDwYu0eLEXSnDajHrvvbS~kFYr7p5G6TUhv24L275n5Qmnsxr7JKetotd7xVlKd4fYeuXwV-o5-G3DNajn7g__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "adventure",
//        "description": "The saga of the Eternals, a race of immortal beings who lived on Earth and shaped its history and civilizations.",
//        "releaseYear": "2021",
//        "price": 19.99
//}
//
//_____________________________________________
//
//{
//       "title": "The Matrix Resurrections",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMGJkNDJlZWUtOGM1Ny00YjNkLThiM2QtY2ZjMzQxMTIxNWNmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1943978777/1434659607842-pgv4ql-1638810372114.mp4?Expires=1678068081&Signature=OyCRquO2RIQ7FZliZfIRY19sn9jT0D2~6nVHVJVhvAIZ0uj6gXvMhJTyeGYwXh1Q0g6HHXZeHM6c8gRaKAneoKO7v5861rjbMpdtzcVASxxH4gJKvAfso~OE-nrn-l3YFQm211BI9Cw2-4AbFKpO8XPCPVWmaRd3Ip3I~sxb9iRQo75d1HatFtZSP0xO9XPBioMvZyAacTaZjlr5Lk7Uxw6EhSKiMq05lER0s3~c-hcRVFV8LV75zFzJD88hR9wgSQ6VzXBX5gxejAdrNZ9nxfODXltVdCmCwis4wtoxOGwsaKVpNlHVKVnyP5ZwoGLmnv3GR5l6BUaGelyjjgIpow__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "Return to a world of two realities: one, everyday life; the other, what lies behind it. To find out if his reality is a construct, to truly know himself, Mr. Anderson will have to choose to follow the white rabbit once more.",
//        "releaseYear": "2021",
//        "price": 14.99
//}
//
//{
//       "title": "Blade Runner 2049",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMGJkNDJlZWUtOGM1Ny00YjNkLThiM2QtY2ZjMzQxMTIxNWNmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://www.imdb.com/video/vi3581589785/?ref_=tt_vi_i_3",
//        "genre": "sci-fi",
//        "description": "Young Blade Runner K's discovery of a long-buried secret leads him to track down former Blade Runner Rick Deckard, who's been missing for thirty years.",
//        "releaseYear": "2017",
//        "price": 9.99
//}
//
//{
//       "title": "Arrival",
//        "moviePoster": "https://movieposters2.com/images/1466150-b.jpg",
//        "trailer": "https://www.imdb.com/video/vi1011398425/?ref_=tt_vi_i_3",
//        "genre": "sci-fi",
//        "description": "A linguist works with the military to communicate with alien lifeforms after twelve mysterious spacecrafts appear around the world.",
//        "releaseYear": "2016",
//        "price": 14.99
//}
//
//{
//       "title": "Annihilation",
//        "moviePoster": "https://amc-theatres-res.cloudinary.com/v1579120310/amc-cdn/production/2/movies/54600/54555/Poster/p_800x1200_Annihilation.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2362882073/1434659607842-pgv4ql-1517692751152.mp4?Expires=1678068784&Signature=jEHC~UDpkxypThv1PXQq5HZAej-iqeNgegxrEbCrfxVcgP5gCA~oJHUYkO3h9QS4iT9VrMhWRb8REVjdRQKiubGMp34IjpZFNfYbew-wZyerzWnpIwngXI96tgoQYx5dq8xaSJf~b6jMw1dWZ5vdI4mZShkthouNquTNXRkrFum2V~prI8eQu1uG6Ts4Zx6OSG2Ha5HMsBAw~b7MVUPho4bXvhnlWkquBv3ORpPcQnJ90vmi8FR3xjSLEsEpJrJ3Ye0Knae2z9r7jWmJ1o5IU5TGIjLNq1iQlXXC1Uqxg-jfivT9NSugT5sUgfZ3yp7mc1yaHaF-V-UUomYEest4CA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "A biologist signs up for a dangerous, secret expedition into a mysterious zone where the laws of nature don't apply.",
//        "releaseYear": "2018",
//        "price": 7.99
//}
//
//{
//       "title": "Spiderhead",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNDVkZTc4OTktNTAyOC00MzQxLThiZjMtM2M3MTlmYzFjY2FkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi646890009/1434659607842-pgv4ql-1652797285663.mp4?Expires=1678071421&Signature=gBocgdzhrz0039GaISQBB6ZwI5vSrOxzt5kwViP276wKei8ou7UvKljM8DOLpeyq52sjgT8UgYWdVWw~dMFDkMm-jbg~v7wnv3kFmKnHnjMzibS1CF8-DBrz5MjhQCShlgQPuPkMJ5gQbMchtYNIg9a47OwMYiZ-XFmPVWH3OR9fQflMSJtK1iBpWpuqRvCcdP3TNbsir3AbRXMiJGCRTA9CrQDvlzSFxiG8uI2ZTt3KWgUirHHhOHxHpmsVhwIgd5mOlplfxjaB65xUFkcCjBx9Lx1AvzeuhFP0s-VTPLc0nVx3gs8zDp91VHdNieFQeBoOyIu68w3M8M7MSeSXQw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "In the near future, convicts are offered the chance to volunteer as medical subjects to shorten their sentence. One such subject for a new drug capable of generating feelings of love begins questioning the reality of his emotions.",
//        "releaseYear": "2022",
//        "price": 8.99
//}
//
//{
//       "title": "Life",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMzAwMmQxNTctYjVmYi00MDdlLWEzMWUtOTE5NTRiNDhhNjI2L2ltYWdlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi376026649/1434659607842-pgv4ql-1488540609405.mp4?Expires=1678071614&Signature=C~0BNiQr62eqPW86dctFXzZ0EnN5wDVT9AGjl2ub2Fp-NrUsK3SbHXH7dxFNRvfhzPTW-CwhP60N4OOfJC5sgLXkhirC0bPJ4c0z0rhnJLRwS~LYwxDuKeGRfdb8Kl72wemalAUQKken7HHLoPWdo0pafXm3RO0-hTwMmg1UkgIiVgEfw-aP2AvOeEbBZ2v9nf38vyLU5s8rTEmTR18QDB9QMS9dp0cd1~QEzbGxmLPwq8jiSvkIdA6A~ZItpHOyT~mkmc3Fz1hwqmuRKwO6WrM~bEVGKRxlIT4sZnIXt9E5jCWpKxZ-DX9x9xJh7fcm12B2pYvfGgMIpBKoyYns5A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "A team of scientists aboard the International Space Station discover a rapidly evolving life form that caused extinction on Mars and now threatens all life on Earth.",
//        "releaseYear": "2017",
//        "price": 13.99
//}
//
//{
//       "title": "Tenet",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNDhiODUyN2UtYTQzZi00YTE0LWJiMWEtYTVlODEyZDQwYzRhXkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2051194393/1434659607842-pgv4ql-1598074723412.mp4?Expires=1678071931&Signature=TFyZX3~zNoL5LZLHC78mbA3ULwoNjYpAGnPS4wHrGzCQWp8UvGinM6YH8US-mKRsDMJC-OcI-ZICuFYIlxRPjS6o7y4pdRy~lzUWAAW-~1DN9lLfScGlRp-RrBaWINvlJhUrn5-xovBKpJSa050qOXHFfFIEgn2OTB5yWJO-fFlk25kIN9crvuljRMuT50zYtu6di19BUC509bgeR6P06GEGeyKJ3ZAbxm~7YeaEoNEjr2VzhDmsCj-WrYsaiV8QpUtN286GGqISzEzmHBatatZpOuYey46iLsSisi1r4MKRqM4n72X4w1Nuy~eGi5N1IFilwru9qoiuEB9s7SpqIQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
//        "releaseYear": "2020",
//        "price": 14.99
//}
//
//{
//       "title": "The Invisible Man",
//        "moviePoster": "https://bloximages.chicago2.vip.townnews.com/newsbug.info/content/tncms/assets/v3/editorial/c/d1/cd147de4-cf4b-5a20-926c-023d0104a5e2/5e6634ea355fb.image.jpg?resize=338%2C500",
//        "trailer": "https://imdb-video.media-imdb.com/vi2623455001/1434659607842-pgv4ql-1581095763434.mp4?Expires=1678071783&Signature=U11VTMXUIjaTqJETZnrGpByJGXrK3flgEgZRhCgrZRfIAdMXva37vnang9xF0LfswqDNajE7wy8HwqjGJ-SX-f8TRZJfwPlXmWpd3WQ9QuiYrvdSBOwA68bbJ6IYfw6xxZuTwQUljsLpTE6wyK8y5IVxZnHQfMh0PWHD3qCyt6fVB7~NRIAkL2DAvJNp7vzvAWvaDwJMc21mZfm3AOmgo4SSdkZK4RxzB1j-P7bAKWjdrZZa618R3DsW1av4XUPpjewC3wIRh7otwSF7TIKgaBVA5mExf4MjuUt7JOoViJL4rPvN~BvPfr-aa-d9~xVogn8tz~T-w2t8itJhSYmsLQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "action",
//        "description": "When Cecilia's abusive ex takes his own life and leaves her his fortune, she suspects his death was a hoax. As a series of coincidences turn lethal, Cecilia works to prove that she is being hunted by someone nobody can see.",
//        "releaseYear": "2020",
//        "price": 14.99
//}
//
//{
//       "title": "Synchronic",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYWVlNjUxNzctZTI3NC00MDMzLWFlMjAtYmI2NWE5ZWJhYjZmXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2695151897/1434659607842-pgv4ql-1600275569872.mp4?Expires=1678071717&Signature=A8bbioL89QcpMTAmzmL9HdUjDUhay9amXxM1JlUbRCEBCyFjw7tZJWhzfahqEr5q1LBWSfzUTZgMN2Mtb6mSBCLt78TiU~lAuFjA7xhwmdHrUmtqg1HyIsj71e1WxPvnW0Lo~-bovCS6J5tIWwBsVvm5O3lIgcUTNGsZz-XPE1-cSmwOXJQ~CCHOaLPro5sVuHR6mKiSgYTjtYUFC2NviIQxFaRGTLcVsQgk5D69FWCcx~hEAwJMlkdvByqavcIafWSDC~oNQeejdby8-aGxCkhMoWszhFpTSuU8UXJggyRPFJQRA1v06aFhs5v9RdceGQMDX~9y59mVdEQR-ii0FQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "sci-fi",
//        "description": "Two New Orleans paramedics' lives are ripped apart after they encounter a series of horrific deaths linked to a designer drug with bizarre, otherworldly effects.",
//        "releaseYear": "2019",
//        "price": 12.99
//}
//
//___________________________________________
//
//{
//       "title": "Inglourious Basterds",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTJiNDEzOWYtMTVjOC00ZjlmLWE0NGMtZmE1OWVmZDQ2OWJhXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3738173977/1434659607842-pgv4ql-1616202372085.mp4?Expires=1678072506&Signature=O70e6MxIerC-a3o1cGifpAuohzozHen~ruSuitlzMv~uZ5ZR8zK891DPlaLrv26dIR~rj4m9B-NkChFi4FZgyR-ekzsppoQEtxUyk-qzM2FJz1FQdyxCS8moYYOGWPpFh28~vVJT~T0rYSAC9GpOH~0amFZC5KeLJicmXNOi95rtr3fQi9hoWggch2dHVPaelPRiSgc~2sgW96VxR0vl3ICxbHZNDE96bGG-P188Jq~pxh1xqJDQmTIJGT~PcSVW~3VW193-2GZxvvhpzqZ12ZldOL4BGdZ-YOKdx5cAX2YwDAOGz1XvkAx2iWhi79MmHGVtImWIpj7rXYY9dZFOWQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.",
//        "releaseYear": "2009",
//        "price": 3.99
//}
//
//{
//       "title": "1917",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTdmNTFjNDEtNzg0My00ZjkxLTg1ZDAtZTdkMDc2ZmFiNWQ1XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4095655705/1434659607842-pgv4ql-1576688989348.mp4?Expires=1678072523&Signature=WLJdrc4EM2G4VVMlQMERmXbHwazzsWNgf16VCkzc~k7y3zqwZGRXS6XWxLhNvXisR~VHzUZMXgitUUo8pPqOSb5U0fqyqSWyvan8FGRPxyBwH6xD8A70W2EUdPq8M9hRrlsr60a~qJbtSMnyD4nT55BQLh1V4i3rIqI9CM3K4f5dWmSHXzq4Y0RhUJsFadaJ0kDK6aPr6eG8i7RCyqwTmtLvftzAqH0ZQCb68frjuPcXO-GRdN1BWiiDwRkD8HMVMF4ihfKnFslD7ADzdiPkvXC0xQiy2kqhg882ITcKTNpEEoXJ2PJzNqz3tk3WAT1hnz2~BHkXGzDZBiSZpk7I1Q__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "April 6th, 1917. As an infantry battalion assembles to wage war deep in enemy territory, two soldiers are assigned to race against time and deliver a message that will stop 1,600 men from walking straight into a deadly trap.",
//        "releaseYear": "2017",
//        "price": 14.99
//}
//
//{
//       "title": "Operation Mincemeat",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTdmNTFjNDEtNzg0My00ZjkxLTg1ZDAtZTdkMDc2ZmFiNWQ1XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4095655705/1434659607842-pgv4ql-1576688989348.mp4?Expires=1678072523&Signature=WLJdrc4EM2G4VVMlQMERmXbHwazzsWNgf16VCkzc~k7y3zqwZGRXS6XWxLhNvXisR~VHzUZMXgitUUo8pPqOSb5U0fqyqSWyvan8FGRPxyBwH6xD8A70W2EUdPq8M9hRrlsr60a~qJbtSMnyD4nT55BQLh1V4i3rIqI9CM3K4f5dWmSHXzq4Y0RhUJsFadaJ0kDK6aPr6eG8i7RCyqwTmtLvftzAqH0ZQCb68frjuPcXO-GRdN1BWiiDwRkD8HMVMF4ihfKnFslD7ADzdiPkvXC0xQiy2kqhg882ITcKTNpEEoXJ2PJzNqz3tk3WAT1hnz2~BHkXGzDZBiSZpk7I1Q__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "During WWII, two intelligence officers use a corpse and false papers to outwit German troops.",
//        "releaseYear": "2019",
//        "price": 10.99
//}
//
//{
//       "title": "Operation Mincemeat",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTdmNTFjNDEtNzg0My00ZjkxLTg1ZDAtZTdkMDc2ZmFiNWQ1XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1054393113/1434659607842-pgv4ql-1638286791205.mp4?Expires=1678073013&Signature=MTpzOnVO6~IkvuDWsNMG0Sl-ODotfPbM8dyQWlg8UNckSohcXJGXXeshzteVQm4lPkNeJFfPyKH1Qme83WzSc4sjWflftRzt0sxl527cMW-q4yZT1BM9FL6-K9QHOdXX1zMxEMBVBOHYrE7wG1BcTBeoNMJwowxzNxq7iESJLzF2jsaUUWIHcDgqSRwx64NYkiNb4JY6nD9LE9zi0n9Rz3aEWD2kNnHszuUcbjsX5JL-cA-rBLG4X3tDHOUpWOVvE4-QnRmkXl98oYci67r4tGNNB5l-UeUka1PTBWghNqK58H0y72WM5avpS1TsOmkXfThFN8kY9ru1Zr~6kr53Rg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "During WWII, two intelligence officers use a corpse and false papers to outwit German troops.",
//        "releaseYear": "2019",
//        "price": 10.99
//}
//
//{
//       "title": "Zero Dark Thirty",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTQ4OTUyNzcwN15BMl5BanBnXkFtZTcwMTQ1NDE3OA@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2281482009/1434659607842-pgv4ql-1616202486959.mp4?Expires=1678073836&Signature=Il3VczjJeJy~YZtGns~5zAGmlOBzb3OYEhSTg9YzcRVYYO1p8H50uakGNbd9xa7PcqcwqkawuBbsHTVLsolTnwxEWS2fFEIs3vbxF8AfRFZFJlTa7iDCIDjzPdOaW9omYvSWVXcqN7ZwlHUFbl~U4GK8HSKc263prVdxBLzjfuUrzSpA7zCYpn5pgxMrc2tap7a3z4Rv2WbRPR7wrqbzeobGI9hcLmRgZt~tPtdfNcUZd30rO3HNKwqXwx5ZjOpygJKLE9LVBS8K4ifDIMaiCG-TC3I3da29qXsSpr48jqaktB2F5IljkfQImo1y8InuFOLBjCEILTfDQXy37uWnQQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "A chronicle of the decade-long hunt for al-Qaeda terrorist leader Osama bin Laden after the September 2001 attacks, and his death at the hands of the Navy S.E.A.L.s Team 6 in May 2011.",
//        "releaseYear": "2012",
//        "price": 6.99
//}
//
//{
//"title": "Dunkirk",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BN2YyZjQ0NTEtNzU5MS00NGZkLTg0MTEtYzJmMWY3MWRhZjM2XkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3402283289/1434659607842-pgv4ql-1500321278198.mp4?Expires=1678073420&Signature=RkEKNROlP5RuWIFi7Pw9SS7kXdO0hoWAeBs3ab7GB3e-iktmbC8L3FJ11pRPoVJqzi4OuH~EJukS0Ka0XtMeFftiBUIp1JCLa6TMo98-wK6cF5X6d2VsCr75C7Q6rfo3RNANljDClJo8-fx48Iip0KmJ6JbyfwzaXXLzYW9TD9jkTWgRniVqEhUmO~sWCQBlSgxGIbTOBtrCCFbBbY0840ICFxde9ke5C~f8gnFYXDBsYRUsd49DyXJl~hm0jGTbt9QZPfsQAjbzbpR6dPO4xKqIhZEv38jPAlpaApLueJAQ-umiLb9lPKa~2jEGlwvL-x7cNB6uM1R29Gd8~3GsWQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "Allied soldiers from Belgium, the British Commonwealth and Empire, and France are surrounded by the German Army and evacuated during a fierce battle in World War II.",
//        "releaseYear": "2017",
//        "price": 14.99
//}
//
//{
//       "title": "Hacksaw Ridge",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjQ1NjM3MTUxNV5BMl5BanBnXkFtZTgwMDc5MTY5OTE@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2608248601/1434659607842-pgv4ql-1469716635759.mp4?Expires=1678073686&Signature=uWixgCJ3Uf8fcb6xlMrwc15tjtN~yaqTVSpUYoatPe2mmY-RfKpySwtG-8T2NgPXJoRI8f5U2ex27eh5wscvrN7xaMcDJRFtbs4vz7Vh7D12v9OtefoJeFQxuaVLKBRjU~bbT0XLOHxLTxm~BVgLZRiYwY1NXIjzIBtkcwm984JwRr8xQJuNdXTGiaXvDs-l48VVNI8wrr0Id64W4vjZAdGuCACmTQdMox2zbB~mw6Chlq2qDcqoRi0Q3OtNXrQf1V2ym8k4UV6pHusqM9e3TNEkqJBYILsQV4dU8DOLyiStpDRRX2iCWyKoESB~t516qsJNWGj4AKRv1kCwY6DuWw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people and becomes the first man in American history to receive the Medal of Honor without firing a shot.",
//        "releaseYear": "2016",
//        "price": 12.99
//}
//
//{
//       "title": "13 Hours",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYjY0OWVjMGQtNTIzZi00OGU5LWI4N2EtMGU0YzQ4OWM4ZmVhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi481015065/1434659607842-pgv4ql-1452549287104.mp4?Expires=1678074686&Signature=mWu8Af5C-xqPb00lXpbv6zF1FZNHaCEAsugP0oHSGnhAc2Hm3yvzqw9-yppXrqLYkOUFLZ6CVgpNUdJESJURDByKyVfNt6efzAE7tjpB4mVogSa9V~XQTCf9dFHrWvwcrm3s20aDr1PuiaJfvb3BgXKcB4aSlumtF7REe7QLmGURlxDBKNE0JF9uE3v1elV~WuqheN~Iy1IcNfnMzNX9elmbYA5WBqF2TY3Rhd0FwC25r~YOUtN5QisiOY6O3GyxWaAu73jY8GvpsGgwesxhW~VAjTL7Uwglf3zEk6Qt-leSjxCCiHt9TDjBW1ccGTXojhkd4zwB66BB46vq8mlIEA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "During an attack on a U.S. compound in Libya, a security team struggles to make sense out of the chaos.",
//        "releaseYear": "2016",
//        "price": 14.99
//}
//
//{"title": "Fury",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjA4MDU0NTUyN15BMl5BanBnXkFtZTgwMzQxMzY4MjE@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1850190873/MV5BMTQyMGVhNjItN2Y2Zi00YjFmLTg4OTktYmMzYmIwNzExZWRkXkExMV5BbXA0XkFpbWRiLWV0cy10cmFuc2NvZGU@.mp4?Expires=1678074750&Signature=Rs~7zTCD~psfIkjjMDwteJLvLzNKUHRtxkXesQGps-9Aa4Gr0Lvfo2ZIBng-PRVAFIXn6xQi1Y7siFvt12ZnG1s4-fL0XxuVak5NzEZCjXfL1wEpZ56VtWUqvaneo5lzHNQcxyxaZh2cfIgVkQXVTk2mVtaK1p18BwLmDLyDGtZ9AuyK9EY-1YRhMeJjtw3zMefI3CrGvYQATG-PDC40g7o0KNQVOGW1qoXsi-daAd9WM-dIV2NTjVNk1Mvqspun34~~N3vKJZf7ItcCPeE1NaG8bHFnQ1o7O2Y9kGJlziDt94NbJqmLo4Xrx2cc-ut1Z79C7UHPoCx-DNVElc6GNg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "A grizzled tank commander makes tough decisions as he and his crew fight their way across Germany in April, 1945.",
//        "releaseYear": "2014",
//        "price": 13.99
//}
//
//{
//       "title": "The Hurt Locker",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYWYxZjU2MmQtMmMzYi00ZWUwLTg2ZWQtMDExZTVlYjM3ZWM1XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2755855129/1434659607842-pgv4ql-1616202549236.mp4?Expires=1678074242&Signature=ikLv-S7tKnfSU6VaydUiyDNbHokY43IkG5EnKwkhlkybSaHXiIZnuElM-wTx7iQePnoQ4gHBtpuEZdmBt~WQp-WwDsnbfCiWyOCnVyJG9ZS5~XIWZvXtqgikvhZT2xv8ggRpEpVhRjnP7wd6ZIOSlvYmKbe7d8lofH68fBKUqtuUnGzy0~p-VHE1k-mIXojx7aHaCE3MCqACe~XLk~82hD8iF~ljma3QehtsG81S7nQMkFrrLSvoRAnffm~DnTbut80GFJgQj6w62rwNee3q0mXXnoFfdnRZhnX8mvXwkHCKAcB4dPlJdkXa7cccG1fTiktJ8CsPfCShC-sEgNfIug__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "During the Iraq War, a Sergeant recently assigned to an army bomb squad is put at odds with his squad mates due to his maverick way of handling his work.",
//        "releaseYear": "2008",
//        "price": 4.99
//}
//
//{
//       "title": "12 Strong",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNTEzMjk3NzkxMV5BMl5BanBnXkFtZTgwNjY2NDczNDM@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2478815257/1434659607842-pgv4ql-1511360289658.mp4?Expires=1678074478&Signature=Kpjbhs1z6IANK3O7dEAIQg6zugoakWpHXquVe7Zk--OL-jCEZRoAFvza09THEmFVbpidE31L9qpu~0ANo0kILbZZnRGnqY98xrZ-4qWxN8AxOrLSwRxTigjW1td-9wyuyOjTo5X7IXQzHClauZDCltVKwE89lXQnMTB~YVCbpmzQWvGzPg6fOt-sTy-ye72B83Ckw9oTbm9j-u7JcKw~fx~J5m--RBVVwAu-7BK8YYyqndUnzIb~l-8NiaiEycjCGaqRCYyQlhmPLUXI8MpjL1A-4a2O-pbrKzfYiipxsEIlqkdYqlTMs~YjebAwZunY8m9Dlv6Cv~-Ro6hNxg-f5A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "12 Strong tells the story of the first Special Forces team deployed to Afghanistan after 9/11; under the leadership of a new captain, the team must work with an Afghan warlord to take down the Taliban.",
//        "releaseYear": "2018",
//        "price": 14.99
//}
//
//{
//       "title": "A Call to Spy",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTk2ZjJiZTItYTJiOC00YmIyLWI2MmYtZWJkZGMzNDE4NjU1XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3731340825/1434659607842-pgv4ql-1596419251835.mp4?Expires=1678074741&Signature=hYzNZBUuDc1ctgY0Fj7w3m38k6~n~tXQohoB1rHdbqf3uBtov4hRGovls6F5TfSnqDCvPV8uT961HhHnBmIJMxbnOgu1P4LisTAuEFm506hKml6EIuaqoj8hD-ETW7q~x7UzGppmFVj4wnhd4RIR3RwStZltQpZ1qHYri1zdzqHZ4SwAAtNocgfbKUsLyss~wxLe~MIVSFXmzhJ0CAo32psym~7rfMMGfItl0yWbmZzXNa6jr0bjG9BxJ44hLvUylJvwX7ptnC-UWDWpqDwbcMov6JaylIPzSBvUJUu8hkDA9R20Cwe0PgweuRn3-IetIUIxjBzZe2zyMopi3GruoQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "war",
//        "description": "In the beginning of WWII, with Britain becoming desperate, Churchill orders his new spy agency - SOE - to recruit and train women as spies.",
//        "releaseYear": "2019",
//        "price": 14.99
//}
//
//__________________________________________________________
//
//{
//       "title": "The Proposal",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOGM5YTNiYzktNmEwZC00ZjE5LWIyNzEtOTUwNDE0NmVkYzE3XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi125895193/1434659607842-pgv4ql-1616202651613.mp4?Expires=1678075807&Signature=JuX7B7ublbmwEreD8mbnevwv3M~AXIuUXrsWinzIptDeB9D~Ul-gFbvRV~TIAYCn2Z7~UkPdGvgyeFj~JR9casUy~c3gaqzH2JADL~RQ4YWW818bLphUIwkXnNph905uAJa~2DWNRM~a0uXY5UiJvZKhgfnaKsSGl7siCeNECWtbLH9z0eXHAO9zKw1DA8UPcJcCutbhzJ4Np-jaiW4uTII761XPUA9tVDnQYALQAQTxygkuj46GhbK-uIi~td85lmdpyCAlOowc6qfmUMXScFJm~iObYeSf39Pt3pr9zHJtLh0I3QPphg3bBAowRN1S9M0qNuuk3WkCXbvjOriDdQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "A pushy boss forces her young assistant to marry her in order to keep her visa status in the U.S. and avoid deportation to Canada.",
//        "releaseYear": "2009",
//        "price": 9.99
//}
//
//{
//       "title": "Jackass Forever",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNTdmMDNmYmItOWFmNC00YzdkLWIyZWMtMGRlMTQyZDZmNDU0XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3793797913/1434659607842-pgv4ql-1641823858124.mp4?Expires=1678075587&Signature=SATiblBF9SpicwPjO-A-i1GpNLQCoEamsixHgr0M6OKW4qQaiGL8SlOnmB0Td4AaifTtXIw-9lCeKW7Xk4pcImv3aCHibOCjWTJqjko0sfrsLTwOwFtOykV~qJFSgkPqwsErey2Po5NSiHbompX5d8tT56Iqj4rLeUhQoEdsKMkDI6J8B2~fE~SAMfT7Z5s4E5gCnqCQAVyQ2imgerHgdCFdnc5sV-TTF0NKAj0ziVIqQoatzbiQ7qIBMuhFezFKTIHrR1L8fVKkBsYmUeyzzupjapBzZlu-Uq~Snp-50ajMkXYBcJi7vivCbtlqh0HekodIOg0fzLaZZkSuAKhslA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "After 11 years, the Jackass crew is back for another crusade.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Marry Me",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjczZjI2M2UtOGMwOS00YWFhLTg0OTYtZDY5ZWIwNjhlOWI2XkEyXkFqcGdeQXVyMTQzNTA5MzYz._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1156104985/1434659607842-pgv4ql-1637243335470.mp4?Expires=1678075905&Signature=cdM5z9F-xgvsOx7CuyiaO~wlwLyBj42WSuf7eXPC0uClGr-p7jOEn3gsT9suvsh-FIWzATWrEt-cHNNb3ihTZIJQIQSqg-XZB9I5wNifwE7tpEsZEs6nKeo5C9HEg2DHc2tW1M71fvr2mXPd23m6rXSmp~2mKVjjrJdUP2RKXmWXu~ujAGBFbdqf~sSdz0GcVLyoA4sEuB2qqvsH-c2ySR~aq2AR0x-o0QNudw5RO2I26W0uH2~LneNy2i34vxljZDcIDsRpLlg1ChF3D92KuU0z6jgnS3GQJIJdVOMhUQKf~kftSG0md2Wkw1LshYY9jTkAphFyzrv~dXxbfozYEA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Music superstars Kat Valdez and Bastian are getting married before a global audience of fans. But when Kat learns, seconds before her vows, that Bastian has been unfaithful, she instead decides to marry Charlie, a stranger in the crowd.",
//        "releaseYear": "2022",
//        "price": 3.99
//}
//
//
//{
//       "title": "3 Idiots",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNTkyOGVjMGEtNmQzZi00NzFlLTlhOWQtODYyMDc2ZGJmYzFhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3086596889/1434659607842-pgv4ql-1529667039250.mp4?Expires=1678075746&Signature=lNbfjgnT2x9pfvDkufnhC1iwNKylS~9AY7O6RGLznhrX1Z5cJdJqJcXSrmaqJ37eMbPAUUOe~RrDS9lwPpOK-JpwBGDzSs~2Vvla0Ry6yJ2Utwa6d3-9Vl~sI4U9p0ondD79Fz~bxuomMtjxEFW4M~zgK2Skup2B37B8TTD09qReFJvwbq92eZmoK~Z5TS5BEWe0ii3e4ytiIUNxW9XFNuco6lJSKXBwoQh1L6aTjftTJSAYkLx89mrXavE4HJx5Qi~VIKhaVOhe73YfcUzyJmikoQckfOucQL7GV0f2kPHG8ARIeeRZjiYXBjwAl~mNSIGVwWkLPCCJnAbcVulO3g__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Two friends are searching for their long lost companion. They revisit their college days and recall the memories of their friend who inspired them to think differently, even as the rest of the world called them 'idiots.'",
//        "releaseYear": "2009",
//        "price": 2.99
//}
//
//{
//       "title": "Dog",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYjA2MDM2YjctYzNhNC00NGEzLWFmYWEtODExODFkNmUyOGE2XkEyXkFqcGdeQXVyODk2NDQ3MTA@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1769259801/1434659607842-pgv4ql-1644871815663.mp4?Expires=1678076248&Signature=gR4C4FGci99xZ1J~x3tagvTYir7D74pP3vnJZAswWZKPiiCcFPD24A8Lr9DldYvMBpqlnMI4owOn~xoLfKTy6DD-3mcbWknZhcwV947sLtgz~B9s~upSZQg5nDFVadJBEsmesYmM8dhkEXu-l8X~xSu3vXN0SJfpMmVWNOM2REqlVm4d66mI9Lx2J43s35Wq2BHaw8qRMOASor5SyfF-KVFOjCvHylFTkZrt95ioKpt1~0TrSxWRRHYm8J7SeN4QdAmo9KNHqjWqbZB98sz4mUf~MMr0Q4Tf4-z~-mmj48l2zsGDGj67t4-WzAOQ-ylVpO5x5-9aGb0Z2yFsg~4TUw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Two former Army Rangers are paired against their will on the road trip of a lifetime. Briggs (Channing Tatum) and Lulu (a Belgian Malinois) race down the Pacific Coast to get to a fellow soldier's funeral on time.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Central Intelligence",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjA2NzEzNjIwNl5BMl5BanBnXkFtZTgwNzgwMTEzNzE@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi789361945/1434659607842-pgv4ql-1458145517049.mp4?Expires=1678076777&Signature=JBGMwLoHbemxlBQfr-D0r47Wt-CXBr9eQvLmcHlXzUcbn0yhqF23B~uLkwflJ650-k63R9eeCiCnsoxbaqJ8n9DqFMynspzXh~L9nH-dwdOifRzG3ohfIP5fZBLcohKycj3zszDEtkiZESptasebG5X-jSnaKOKRH4fgCUVBOG9XNhNTg500ncxnuW8EmbjUv9ThbT8mEJ2NDSoVzWUZ7CcfJxa6gtgJBB1vIxZEfGNYLGS7EfYXakHs96gPvOqRfYqgK9QaSVwYBWj0B1QxTkR~0LfFsYD1yHFzk2~wzZ4DMRIY5TqegPEhVxuhHRdKReOtcCXsxAkx2aIt~kz6Dg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "After he reconnects with an awkward pal from high school through Facebook, a mild-mannered accountant is lured into the world of international espionage.",
//        "releaseYear": "2016",
//        "price": 14.99
//}
//
//{
//       "title": "The Unbearable Weight of Massive Talent",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNDM2ODNiMWItOWRkNS00ODE3LWE2OGYtNTZkMDJkOWI1ODMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2192097817/1434659607842-pgv4ql-1650302441361.mp4?Expires=1678076786&Signature=LMqb3mKykUmLo0Y8MDIadcVhuMNDsO7vwCjuuIJm3Z20TNUQ-ACP~weProzpI1aNWn3cEpep6ax13na8GrmOZ5PZ0ROySqWLoKXB6~nradSGdqGFLHcSCnyQpD3mDvcoeaV7re0314xXKbsvsym3Jk73e7laPFl6mjNfvf6QwiGzR-oh2U6Kw5bHQCCliv5aHi-Lh9BtQ7RlKnh0B-RXWFqRmQ~2WENihNAx-uMlx28khzrHzsKyR1OaNMrWxvAJzCPPR8I-O1YMunUwTsfRoXeZlXyg9Fs7aLCYjNU4bwWxoZ56b5up1p9BO5bsodQqLwjbB1f0DLpyviH~J1PE2Q__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "In this action-packed comedy, Nicolas Cage plays Nick Cage, channeling his iconic characters as he's caught between a superfan (Pedro Pascal) and a CIA agent (Tiffany Haddish).",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Step Brothers",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BODViZDg3ZjYtMzhiYS00YTVkLTk4MzktYWUxMTlkYjc1NjdlXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2847015193/1434659607842-pgv4ql-1616202999489.mp4?Expires=1678077272&Signature=kOI6gmILsnRSxdaQRlVBFsdWshbgcbpVx3mUP8-aD4oZ77Y5M1js5Z6OzV9ncPuFJNJxI~9K0f6JHMJTn8VGk-TsTGckk~zjTr97-Qb8cWt~NE-e9dW1oRFPVw6gayw4pbskk8Qux-NayQkIXbnjMSSdYPIeGLKaGbgbmctQPUfDhuWy0dZUMOKo7y1p90KAhNBV6BzCMgHqEm39AM-Zu74sE9F8w6PjEX~lGx~PC9VZgyFo2qBv37GDnmDZLn-Y9XLorQC2~5Y6kn3cNsnfbavFeVUKkeZNhpYzAkhCo7T1n2s31wjOU8dt5FaQUnFio09aLzUENmEV4FLEaOcd7A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Two aimless middle-aged losers still living at home are forced against their will to become roommates when their parents marry.",
//        "releaseYear": "2008",
//        "price": 13.99
//}
//
//{
//       "title": "Talladega Nights: The Ballad of Ricky Bobby",
//        "moviePoster": "https://images.moviesanywhere.com/178c5be4925cc786f36b74a9ae748b77/77405e76-b9fa-4554-b15a-ab844f192fa8.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1765868057/1434659607842-pgv4ql-1564710035015.mp4?Expires=1678077429&Signature=Cow0hFtacqpB2nWogGsIC2FWHv47k7lPkI5hrXqz6ZDSWDh3Mf9YQK~wmRybqJtSFoi1tv4~zMD3WNN2QvJe47LofZ5d5CTADHafwTAsbTX3OvQdZy4AuYYwHtjrTSYSHZD33MDi1o-0L~M3PegwekvMsEsr4IbhlDNDsnp7llvF~FSsMP5HESqwYdPSul-Xrt59EV~XVH13~pGhfbnGNWhGMDxZw7PLkelPAN6PQEbqu99RXKc8nc4kbPRMk-IhVPrnYiVla4WegN-69ZslPwc8U8gawUWpz9ZdUTDzpMi-jHMzpGXmJNI4xCLNEsIYzQ3XmF4nTYxQfPZFhpi0IA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Number one NASCAR driver Ricky Bobby stays atop the heap thanks to a pact with his best friend and teammate, Cal Naughton, Jr. But when a French Formula One driver, makes his way up the ladder, Ricky Bobby's talent and devotion are put to the test.",
//        "releaseYear": "2006",
//        "price": 13.99
//}
//
//
//{
//       "title": "The Hangover",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNGQwZjg5YmYtY2VkNC00NzliLTljYTctNzI5NmU3MjE2ODQzXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2650997529/1434659607842-pgv4ql-1616198012469.mp4?Expires=1678078072&Signature=jWAGIOABJXhXe~4xGS4tMjlEVLHY0owofFo0aOMl7Vs1MfQ5g6Y8GxFmItfeIvSkOur5OrxhSkwjGT5mRotkACDR5mOBN4-ZEsjmufGy4cPMEO2iMxOR3z1hG-CgL19GsGPmGEHZKE7D~tOb5SsvlbKxrcKsRBpORvIH3yy5zSPaxW89Ixvs5gtI5cVPMHIUcuEL3dxXWgfxCnC~S6hV~uPxXxDRzkrWGplBdeSmnJcm-2IZiBHahAVmjUPrJ5axdAG6arsP1GMBEG238rK~kQb7v4zSMx0tcg0bXUy7KbAVJrQpN9o3ihhsCIy4AsG5~iiLY~GwhpmRoeXITV0cFA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing. They make their way around the city in order to find their friend before his wedding.",
//        "releaseYear": "2009",
//        "price": 14.99
//}
//
//{
//       "title": "The Banshees of Inisherin",
//        "moviePoster": "https://galeries.be/wp-content/uploads/2022/12/banshees-_poster.jpeg",
//        "trailer": "https://www.imdb.com/video/vi184599065/?ref_=tt_vi_i_2",
//        "genre": "comedy",
//        "description": "Two lifelong friends find themselves at an impasse when one abruptly ends their relationship, with alarming consequences for both of them.",
//        "releaseYear": "2022",
//        "price": 9.99
//}
//
//{
//       "title": "Bridesmaids",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjAyOTMyMzUxNl5BMl5BanBnXkFtZTcwODI4MzE0NA@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4215119129/1434659607842-pgv4ql-1616204081150.mp4?Expires=1678078718&Signature=dz1IVxn343IueZPwDRqe2eJ-E6lCxsmHJ2uCjlR1RrguL7JFImxdaJHcfY8JaGf4sa5OfwKCo9uy53mpEvSkPJpqTkVPkMO9Mf0p9GdfshXzjorplq1MRZep-lrupLO2paLKv7m97EJvnLCo4OYZN-Z80d4vLRFhJfd9E0~YOyLbX5C~TDH1In3dBfz772ol-mEN-ucfDtq8uoq00D~dFOJSUyMdYZaagC8CrBhgCK4G0W6MoytUWBVu2DxudTbGKmlmQ9Cs3dHf28A0mrmsdwqj72clgNdO0-KhUnF03UTHNj1bFFCXN73rfBkImxUYkFYLEjfpuyKhvjpaOYe0Kw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Competition between the maid of honor and a bridesmaid, over who is the bride's best friend, threatens to upend the life of an out-of-work pastry chef.",
//        "releaseYear": "2011",
//        "price": 14.99
//}
//
//{
//       "title": "This Is the End",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTQxODE3NjM1Ml5BMl5BanBnXkFtZTcwMzkzNjc4OA@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi166438425/1434659607842-pgv4ql-1616202644229.mp4?Expires=1678078575&Signature=mPiIQ7piis~mxAh0XaZUCh~ZC2sut-pEZ~Ivzx~OIfxoi5uKNzS6uucaIrCBAvdmrkuWpzt-t4FZZMKybMKF6pHRKI-z8zFut8TVp-s8qshy8kzmGTfP22ChbY5plVzFJ~vtXOegDNWZaxqSpgT0QThcHiifTALZjEHuPxzvP2btYlssrmIa1sex8OF6L9nUhtIzSK31ltASkw~fgDWdQFafe1SqNwauWSCOlkJtDQsi6E8dQ8G4WD-Og23snsc5koU7jadrRw04WvEDNpWoIOHsZB7MiLsNwl7EbdetD7-LPu43LujiREEtgpwRN36uS722eeljVDDSCQ4hdH~8tw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "comedy",
//        "description": "Six Los Angeles celebrities are stuck in James Franco's house after a series of devastating events just destroyed the city. Inside, the group not only have to face the apocalypse, but themselves.",
//        "releaseYear": "2013",
//        "price": 14.99
//}
//
//______________________
//
//{
//       "title": "12 Years a Slave",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjExMTEzODkyN15BMl5BanBnXkFtZTcwNTU4NTc4OQ@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi302032921/1434659607842-pgv4ql-1616202536163.mp4?Expires=1678080944&Signature=pL89ELTFYpsjNgFpyJvA9ZWw5Dnhy4yf~PIqAsxBdu2q36cnT3i57nvQ3c~oTCW0x03aOEISDEoxN2JqI7NrhBdLj3H6y6Lkdnob0TsMA59gO6ep~EvAZ3KfRbdtY9M0aaq1VW~llgoyvAJdPyYMcHILGgtDSX2K3gkoZD-rgZ0EBlEvfdS53cuDYDO9Wo5CtZZvvhJlFIUTEQChw-12TPSFftlURddmb6Gm2vIMsA5RzKLwUoEMhXTQSzYN4hRZMzLDSzlcDOI~gsEexwbnB3qc6gC6-FxWva4y1TBvT89A6sVcpHGuN3OGXVdhuT8n5zOlLlMd0L1v6PqoERgW3A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.",
//        "releaseYear": "2013",
//        "price": 14.99
//}
//
//{
//       "title": "The Shape of Water",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNGNiNWQ5M2MtNGI0OC00MDA2LWI5NzEtMmZiYjVjMDEyOWYzXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4105025561/1434659607842-pgv4ql-1512496529407.mp4?Expires=1678081925&Signature=C4E1Jr8nsBYx~WYI6WPujwQG4g5LJjx0eAYx1MVG7Uzf0vhqMXfAl4SVaepFmMy8W2JrDa8fhtNpIVJ3Kcl7YhLOVAzDplIn147K3aKUvmsIXIEbkQa0XjlSz~~NkXF423iJF1EgXjvXYq2TezuzMemGepsej~Z9XA2jw6vL3tdoQUZF9vK2WTyrQzySNKdRrOl9dW6QerEGf~qpvdicAIvrOcNuM4AVIQHvlQ5O80zPtnLc5aLzmVNd53IfOSQJ9B5x78kMjpbtHv9RV83B2-wqpQ0u6BICCBA2AcB6sNijnSft4mux2r2wtiylt5vrh55ngI6vO~GsdOGN9bjKnA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "At a top secret research facility in the 1960s, a lonely janitor forms a unique relationship with an amphibious creature that is being held in captivity.",
//        "releaseYear": "2017",
//        "price": 7.99
//}
//
//{
//       "title": "Amsterdam",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNDQwNzE0ZTItYmZjMC00NjI3LWFlNzctNTExZDY2NWE0Zjc0XkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1647559193/1434659607842-pgv4ql-1657120880840.mp4?Expires=1678082384&Signature=JcBPeKZkR0i2m8qfto9yHPGpGwK~rSSpEGgfddp16bwQu25WHPED2yMTJkionmbcT-GOFZl340n2noxi-ejPLqW23Iec3ga9Y7wc24MxqexXoFutSqEDdaH73~fSOm48~r~BC5UAPRL4kYpgxtDEc92akX-knesDvhlnujLJ~5IK9fcJj7U4wkVhcF8laVODyLl~zAIZg4nzzSoUhi3UUchc8OPUEISG-8OZMR7XNTK~t2573ayNkqWC18SdoGEzWsA74mUumvu5TzpN1fSO8cxg5H~kWIuQG3MKt5b-ZhLCS4tl7iF7~N8NYNGZuiOippieN-8iMczat84mTeQ6bg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "In the 1930s, three friends witness a murder, are framed for it, and uncover one of the most outrageous plots in American history.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Tár",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BZjZmOGY3OWMtYmI4ZC00ZjEzLTgzMDctZmE4NDUwZjU3Y2Q4XkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3426534681/1434659607842-pgv4ql-1674832056877.mp4?Expires=1678082338&Signature=kemyUE7AsUPKMEzg~74kyqLYn4yQsb2AQsfnv1guvI4oTixEFoSZHY-HeNgWGuaVW~DN3dkkSkKxGWUua3Xy-udJrJuRj-K~JATP2waamIw8MS7W7Qky4iewG7KhRlDOzUIi0RCLJt61lVRir904K80vdgdxMtKimGEHiivQ4hX6FVm6nm0LrZaVXOo4VsFT-piJ-MgYhXTX-T9PdqPOMCIb8HgEWuLzZwPQzUe8kMdbo470cnGDIenwVqIlLVjufhYlvzWIw-WN8ZjCllYxgJCFRMWAMQy7L2g7UTjaVOCujlep1kIgYtNi2pPQfJ6RKNy3ECfl9FJ-f04oSn445g__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "Set in the international world of Western classical music, the film centers on Lydia Tár, widely considered one of the greatest living composer-conductors and the very first female director of a major German orchestra.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Once Upon a Time in Hollywood",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTg4ZTNkZmUtMzNlZi00YmFjLTk1MmUtNWQwNTM0YjcyNTNkXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1385741849/1434659607842-pgv4ql-1585091468875.mp4?Expires=1678082479&Signature=tTPnM5Uam5TzARH2Os6LJnqw~MI1Xc8H0TFg0ZlYG5rKAwykj~tvIakijwJmEhll9nqllT0oDXkWcFD8g-etBDYASgPMbUzQhpOxzHM3p7l3OuNH4YUFGT0aGZ-L1PGHMIjBHnaHTMmmUwMINkb9sI-rijJ6clPrnde-T8lgrx5vULwPgYS7E-TzjnscUglxa-Jtcg5MSVdnNAaOTSt8lFCtapDMfpscMUaDHT3gHr3jvu-HRFCMXO2MXdJ8bpjJmOWnAyzbvCBkB9jZ8zESrXu8EoYTH1T0t1B4QYs-eBWa3Ea~uTsVx6R-BnMUmsEmGo9gHgXX7tO40oeKBUdfiQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "A faded television actor and his stunt double strive to achieve fame and success in the final years of Hollywood's Golden Age in 1969 Los Angeles.",
//        "releaseYear": "2019",
//        "price": 7.99
//}
//
//{
//       "title": "Les Misérables",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTQ4NDI3NDg4M15BMl5BanBnXkFtZTcwMjY5OTI1OA@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2712512281/1434659607842-pgv4ql-1616202493771.mp4?Expires=1678082463&Signature=XN8KUMeKFbC51sAsuXJCUIWcJlVRiMR-Q2JUtW3xh0zLt3OAaE2iRwbdOhagLiVewxns4oepp8LJOzKZQk185J2fdEGhwZfQ2fRkLoogC-ngSsH-QFHeheZE4bnSBzf~-6TDvkr9kUwJxKBHj0NkJA1ePc5XTJ9iUx0LsVfEt22sjmapAp8U0XwT8O~0r2hWiGsz7fKUNpUjIQxdmboQARI5hkoAm4sD~qhZd9GQYUDJqpaVFZVObRfZP12EGzpeDKJhkGDZPm-We7N7Mgc3Jke4LECOKSoujD4J8yGkI5YQ-rK1CZHJ6s0GT3C-RmvOMavqm47tzewF89IRaOMcEg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "In 19th-century France, Jean Valjean, who for decades has been hunted by the ruthless policeman Javert after breaking parole, agrees to care for a factory worker's daughter. The decision changes their lives forever.",
//        "releaseYear": "2012",
//        "price": 14.99
//}
//
//{
//       "title": "The Woman King",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BY2I4MDIwYWUtOWMxNC00ZTIzLWE3OGYtOWUyMmIwZGE2NjU4XkEyXkFqcGdeQXVyMTUzMTg2ODkz._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1362346521/1434659607842-pgv4ql-1657113532600.mp4?Expires=1678083008&Signature=IEygdTcbJrq32xh1cL1Umn2XJGDiViTT8V6ZeQ4d-wodcu4C-VQybWrhVzRlzJGQ~v6mJADXtTgV6s-m3jiQ4pTgGF1kchuPfREU1O2npTJfRPqxETKLqhvfnaYS4JK5ddfMJPvpX1mvCUDdd~7hCfBSRmvXJ7l4xG3U~z9yt~7XAzuLFC4bxIKd10SKqoNUgKK8DPDjwQogt~IsEE86ZEz5kd52UmYx3FxNOyzlNO6JUdNSrci7VkKJ~pwppDG6cDBAXB-W-lJCWFGEYNb~Rf1KxxuliHQB5gdicHhbeUzDcEQ8zX8LsHTY7Vj1lBXcNT0u-W16gr1f06cpifMOIg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "A historical epic inspired by true events that took place in The Kingdom of Dahomey, one of the most powerful states of Africa in the 18th and 19th centuries.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Triangle of Sadness",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNDRiZjc0ZDMtMjhlYi00ZjAzLTg0MDQtZDI2NGEyYTBlN2M2XkEyXkFqcGdeQXVyMTA2MDU0NjM5._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi470467097/1434659607842-pgv4ql-1660061202888.mp4?Expires=1678083311&Signature=CPDm4AJPoGqHy5hNaPXQ9d-D8LEMRNo5rinwfdyCALqFdovHSy84mPxqjIsdCdjGVVWLu2iUT1wKPkt1C5RGDNNKLLfN-J5XOFkpm389kJXbmDowLQSkbCa9Ffu6OnlydZxPlwm1Q-Q-IT5VCA41pm9xleSP7tghHxR6e8ePKzqgpHk874qvQUc1ryCSadoTP5UD3N6SB2Ecwy5Lq26FUTjFvF--6w3vDddfq4QKfdTRZgsNUAghpesjiDkXDOVTws7tLKEkSEsKSTxVoJGkVaXrRWtNMR05iLvMJg3-5zrdrjIlQvnn7wjfV5xnS~9DJGMsxnItKsf9guFbjX746w__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "A fashion model celebrity couple join an eventful cruise for the super-rich.",
//        "releaseYear": "2022",
//        "price": 9.99
//}
//
//{
//       "title": "The Greatest Showman",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjI1NDYzNzY2Ml5BMl5BanBnXkFtZTgwODQwODczNTM@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1588967449/1434659607842-pgv4ql-1510582065047.mp4?Expires=1678082890&Signature=M5NUYfwGhaCYPekRLZbxmkVWs9fcQ0mPqtUJpmqPh1rUlIj62GTrNUCfxsPLCbK0yJIwj101xqWMAER9acPUwvO1pzvEUFWcal05~2~bQt7XOPk0~rWn~PrRX0t0qC3SnRdlVKccz7smfjnhrYOC7J0bJ23k7nRzRA-cVGWTScYBWMhJ2Rg-PfQwYPeTZj7N8Zoy-~8ZSuI9WJvSnFgRzeVVNH~apUMQ7u4BOmJf4N3HVTPDSxw7NtCrA4S1IguvIa1hnPZ2R1XwXKysNxjq4p77MBu-u5Ehd80mKIRR9VBpNPUaNoAqeOVczbAOXhNQHkq12D757QspGojH5F8vmw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "Celebrates the birth of show business and tells of a visionary who rose from nothing to create a spectacle that became a worldwide sensation.",
//        "releaseYear": "2017",
//        "price": 19.99
//}
//
//{
//       "title": "Significant Other",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMmY3OTVjZmMtMmJlNS00ZjY2LWI1ZWMtNGUxZTQ5NDk4MmI1XkEyXkFqcGdeQXVyMTUzMTg2ODkz._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi659341849/1434659607842-pgv4ql-1664564234898.mp4?Expires=1678083985&Signature=mv0~WmxlYnPf5JBD2X1joAzHP6qeUUpIZUjquSi2xE8iwVQjh2fPhuG8HwrH15uvvj4S-5BvH-cXl2TgNO9wzyCYLUETuPe5Oi3vnRE-BP9fj3DkstNQi2RYXQIBhv7FDwQzEJF918RBGoqnzjew7XxwyiG2aUGpapO2s2sHJyyIuBMGl8lP92gzOSW7GEZzQBpMJK4XqjvVR9QCVMaynSo3t0I5DvP-U~ylkuI~NdY~~WikV5kzR57zdV5cDKBUox4QbZ2PA79SRbmkgeKMs-RYNxUqUcePU5VGxDs6OLXfy5p1CVzRVcPLLys-G6bHu2vc02LvXZp5KPtt4R6fJA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "Follows a young couple who take a remote backpacking trip through the Pacific Northwest and face sinister events leading them to realize that everything about the place is not as it seems.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Whiplash",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTA5NDZlZGUtMjAxOS00YTRkLTkwYmMtYWQ0NWEwZDZiNjEzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4006456345/1434659607842-pgv4ql-1616202354600.mp4?Expires=1678083403&Signature=DfAlmsHQtBDLSxOIPbXHAEIGAENPcgq1vME~ip5k4Hj4adU3dmlFAhlt~woXZa8qILc8O~QP6XXN2E53j5dF-H1XaFcltMmC4UqsLZ7vJ50QD4mXKDlCZjoyl3R6uSfsYKJ2zb06cGYKn11N7l46Hpe8ZihoVBNNM1UO4mJSSUvib1ZyvF0SSH-MglbgIlkSgdNvRGv5p90CJog3prbrFNJfkzXzZnRWBX5dfG~beH3p3vXWw~rvQyRijE9tQeJXLhb1fqJ~vuog7z5FdvScnl3wYJRsARSWLm56inGJ3NNW5tMWMV2vOSUepCJkvHcDtZ02mYf3lhXaCtE26XAmaA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "A promising young drummer enrolls at a cut-throat music conservatory where his dreams of greatness are mentored by an instructor who will stop at nothing to realize a student's potential.",
//        "releaseYear": "2014",
//        "price": 13.99
//}
//
//{
//       "title": "Gone Girl",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTk0MDQ3MzAzOV5BMl5BanBnXkFtZTgwNzU1NzE3MjE@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1298770969/1434659607842-pgv4ql-1616202356128.mp4?Expires=1678084285&Signature=oQVQ4pLr-8kyz65gOmCV9pFOGCzUMLM2kCD9pJl1S~NrbxLRPYKY8LsdPShqp0KmqLi6JLiP9JyIwKv5GIxF0qz1Xdwm9iX-dnuz7sdviOdBq7Ike0zgMxxdQTNRGfp8nj0ZGBkAh5ZUqKGGeJ0WqDx1ZCydVzZf5Kh1HMq9fZlysvrWBBYDcAc2wCdv8PloWkY1VdvZ-HOvyzXQFMwvl~L~9vS40hjQBdVs1N5vz-xq8RQjLozclNXYJxytZA5wIkQKiZChLbM0jfwZDv7x3IC3BOcv4N73s6kzbCbEVM~3bP2SzK-GvE-c-MHrhjmQdA-EqknrCbjF2m3GrATnWA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "drama",
//        "description": "With his wife's disappearance having become the focus of an intense media circus, a man sees the spotlight turned on him when it's suspected that he may not be innocent.",
//        "releaseYear": "2014",
//        "price": 4.99
//}
//
//_____________________________________________
//
//{
//       "title": "A Star Is Born",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNmE5ZmE3OGItNTdlNC00YmMxLWEzNjctYzAwOGQ5ODg0OTI0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi94288665/1434659607842-pgv4ql-1528301702995.mp4?Expires=1678084593&Signature=N2kzeLFVr3lHy6zD3CLjscyPiNs~ML6VISN10zvvA6kD3LSyufCnH5tWmV3etmkj0wHzYjoeW7qjpS6FvDHh543IApzLhamgAR9wj~K6wFvwdFT~hSW7UDq13hOWbB~8R0ApVzSk6cqwVQcDPlMBE0PA2HY4~U2qqGYXQafZ0t-Ii98IcfWrmD5TgjE-BJazIln3WAH~TpKEJbZVEV2~WAPdyS3afQOlu4-7Xv8822Ss8FwSHN-0wy~5yeZQblkaRhaW5iqYFFwns823nHwcJSkcPyjKRREMw1p~Lg~ebe~RP8iHa9HvPz8L6t25DVJG9UQdYwtOaE8YI-kfOkm7Jg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral.",
//        "releaseYear": "2018",
//        "price": 14.99
//}
//
//{
//       "title": "Where the Crawdads Sing",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTJmNGJmYTgtYjAxNy00YmMzLTk2YTYtMGIzMmUwNDMyMTY1XkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1468973593/1434659607842-pgv4ql-1652800447888.mp4?Expires=1678084859&Signature=S~VYE0YGi9VBAcmunHY1IflD27EwDEUteHKvfiA206Mz08mIO71ds3wVUfDmuLWJ~LoDR5gW7ZRKHnLxKg11uiWKqCWalw2IZIV1-xFgBnvrUA4RtWThFk3sAh0Tfut~zh4AUgkNuzkGNAqsnTbojV8RsovE81KwYP0~RTs97sBD3Nl1iMcugevA8b5m1JYWurz4BJ93rDuRD8SsQC5DU2ObBGqn6C6Ih55DuI6hD9qAZ-8AVfrFu8EawRUzA5aYiLOYLhxLl7qL8AYzmPMxZer0bWjZXUTEVJMcR8HYxX-YNNFnIiyV68jK50AQIsLeT1bH5OJQqHNrNbcWEF0sZA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "A woman who raised herself in the marshes of the Deep South becomes a suspect in the murder of a man with whom she was once involved.",
//        "releaseYear": "2022",
//        "price": 14.99
//}
//
//{
//       "title": "Licorice Pizza",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYjkwMzIxYzMtOTVkMS00NDQxLThkMjItNzgxN2RiNjdlNTliXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2244854553/1434659607842-pgv4ql-1640042137139.mp4?Expires=1678084636&Signature=kYQKDYRuUOJWsQg23zTdiJAEGvKpnpFz~M9KrjV-N7MqZcw~qfLHB4qtIDGRWreoza7NpS7yl3dllzL0hoWpKf5SlOE2xGEcuMntDSl62NKccLiAkVkuCQIPI2Fh9vNpZsfKP3jHQmLH4kyvDdnbp-zTGp8JcznPjHq~aRVEJ~OVq6~xT74MwHwUfCOZQcVVY2oGIEeBRxk76PmaTqoXHJU-MbNxsZ7CSMQGTk0e2Qao04zSsIZDvjjutunzqFMB70brqmGio54kFFBYlypK12pMcWww-4in63-hjaY4G9iVbpUchF2mPCIjE~FFxC0dMWhdBCLDAQ62q2zcmKcZfQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "The story of Alana Kane and Gary Valentine growing up, running around and going through the treacherous navigation of first love in the San Fernando Valley, 1973.",
//        "releaseYear": "2021",
//        "price": 19.99
//}
//
//{
//       "title": "Scott Pilgrim vs. the World",
//        "moviePoster": "https://m.media-amazon.com/images/I/517XbXyIwRL._AC_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4036739097/1434659607842-pgv4ql-1616614648022.mp4?Expires=1678085304&Signature=KjfNFV~~Vx03oPwY6DmRzz3ylnqfJJKIMBcX8KWh9PuFcUjpXRAXq2RC0~pU1TnERLYGxwrSKdH7L-yUPmYE7xaIOLEsiahWazDMuvnsjRTgZyofgl0oipN9wFCJelyRJKrM9PA7b2kqhQ0YhbHOdpWVhOdmJ1umQrxVJ9zLQL7t9EPzreupcOsge0TISWH7hvx2Oxf4sVdM5ZLklPUhwVZYOEjn7ISN8wUsOr7mWlODA8HYtV92QUCjIXaWEks9DZV4zsixpMbz5iqhuCbYBu0EKnQGMlywrhIX4gMD1ToMWmZ8rhTjLyuWStjPztOd-TlefgcOEbntyfye81zYGQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "In a magically realistic version of Toronto, a young man must defeat his new girlfriend's seven evil exes one by one in order to win her heart.",
//        "releaseYear": "2010",
//        "price": 14.99
//}
//
//{
//       "title": "The Vow",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjE1OTU5MjU0N15BMl5BanBnXkFtZTcwMzI3OTU5Ng@@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi236559897/1434659607842-pgv4ql-1616202594790.mp4?Expires=1678085158&Signature=gcAq~uDmMvGaE4~qe5aDB7KCSGlK05OBRFF6Jl9gF09wmBZqT30a6rR5LOK27OEVVY5PRrMif3SY8GMGjpNNH1DePaAdauznJ8ctrsb2kCzBDCR2y7ATudj-ZRY2fLflNEeaHhrlS0p65Vii3XSB-peFjXSyG7~iApMXVDTJMPE8rzGhKdHbYLd4tqCSp5Ow8uzC21eo~HaZycQHzud7~fhCCPEsJJtxuQjjwrvmxYzUwYkIR7AWXUJu1q7y6~84Xv33w-uR7btXCNo1nTd514vUN1JPaeeqLJcCJGzlDFW3ttsACCdmWAYNte-A-Rf6TYVk4truw~lVGl5NWb53ug__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "A car accident puts Paige in a coma, and when she wakes up with severe memory loss, her husband Leo works to win her heart again.",
//        "releaseYear": "2012",
//        "price": 13.99
//}
//
//{
//       "title": "La La Land",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BZjYzNTMzZTAtNzMzOS00ZWRhLTg3MWMtM2NjYmJmZjU4NmFhL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMzI3NjY2ODc@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2514728473/1434659607842-pgv4ql-1478184782082.mp4?Expires=1678085533&Signature=moAhxG6EOAKBxFlqQZAoASYq4G6pNs9TO73zrtE-oL5iBrKpX6tEhkp8A3Z-shZGTfJNYfaucPy6wZDdAzCvREZdbFCjXbGO4RCZkGOgS7EXmmDTA0eE5C6e8xU2EpYBq-FzHnVKtdnzt47C5cihWQtNsJdRNLJe0KCI-fNnhZeZs~UnfWcUNNUTQcw1R7Zo3~5TfVDM0LX~rBpsusf6TuH6O2YpjhHUrymMhHL4F6vtPFPeacBXQs98WWT95x-5Ysq7rbKKSf9mEpsuElrhZ1emullx~WYdS8XZKkSWhUm3QCPVrwhjbNXPez~iQw5uHo5WbU4gJnTktLqkEdBoWQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.",
//        "releaseYear": "2016",
//        "price": 7.99
//}
//
//{
//       "title": "Crazy Rich Asians",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTYxNDMyOTAxN15BMl5BanBnXkFtZTgwMDg1ODYzNTM@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1884338201/1434659607842-pgv4ql-1524490207015.mp4?Expires=1678085792&Signature=he~Zeik7n8fnpn6aEEGhRUs1kJWfNhzGnZ~37GfQt9jHOBQu0nD8j5wB1F5jpvlILWL56AURZkvVRns0~6rnxJrtYRqQmGVJzEjAf0dtiItl9j7M2wfdxDzWOc5d-e2xAubu2zmp7b1V2WS3etL5M7NfoFsuG-jvvYE77ATV5qDvozEUtWPzy6IwsGKtbgTV18ZWiBoDp-hnvvtGnIyrZEJY9G2TV-rCCL1601eCarF9URQuC1NM6wYHbQoX2hf4AnbWghCB62Y9m~DOOOFLbHRVV7-z72fagoQpU56MSft-Kx3mPXWcD4Je1kwlINBy5kF1t7fzVBKVDZdQ~L0Rwg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "This contemporary romantic comedy, based on a global bestseller, follows native New Yorker Rachel Chu to Singapore to meet her boyfriend's family.",
//        "releaseYear": "2018",
//        "price": 14.99
//}
//
//{
//       "title": "Emma",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOGRiODEzM2QtOTUyYi00MWRlLTg4MzMtZGI0YmUzNWUyMjQ0XkEyXkFqcGdeQXVyMDA4NzMyOA@@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2031927065/1434659607842-pgv4ql-1576539266200.mp4?Expires=1678085832&Signature=VjRe2-H7TXNQI6c2sQUXbs8hdrJqyw2oYQahZxViQV1db225l5S-hOAaCFExRbCuRjsbRn6yQ0JmzssVeldw4PvqCSRlY-T2lLVibgzgUfklcNhIG1bCDE--oauheL1Lxu~1lqi6NdWPkChFFTdkqOsk5mpcS6ln1EEdHR6UOH-CwLzyMVsYlEfZJthG2v~IAR9qa2Pmjt61uQ-Z021vOTsfvJL2seRGH-e2unK3qHhYpZWc-HoviZ7q01H9sXCBlropNy35jLx5EcDXpmc7iIAPp9UsUbi~8iI0~NoOhlpso6ILxdD-~XtyXA4cLHpQlFMUrP7EmIpHu1bp8sQXrQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "In 1800s England, a well meaning but selfish young woman meddles in the love lives of her friends.",
//        "releaseYear": "2020",
//        "price": 14.99
//}
//
//
//{
//       "title": "After",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOGUwMjk3YzktNDI0Yy00MzFiLWFjNmEtYTA2ODVjMzNhODhjXkEyXkFqcGdeQXVyOTQ1MDI4MzY@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi191412761/1434659607842-pgv4ql-1550169864182.mp4?Expires=1678085877&Signature=NxrEW6c0D8Vgs2ogStUCPb903Z2Qu2udy4tlWZ~0x4UcYVKrr8Xm84PH0E5iWZnlDIaPdjpJJwENeqqZn9d4v3YF63i0RYSO85qOYxl6GMN5okSmX4~8t-uvtfIzKo118O8WBwC8KiZEjcTHFkq4qebqq5jQEHhKQ1xuiE4F2CMiC~s6QX1BRSELN4z3j7L0biO02fKXz3pJbSDxwkDwvWQPKtnjW1pu4Cb0A9~QPRpFEgoEF~IN6MB9Ahdd7TAfW322jSS9k1OQt97T4Kt517h8TOI9E4E4mhWbvKaY8oFkcZWBFJTDjeMl29HN8Dl41DQKvTkmV8HvedMXz-G~aA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "A young woman falls for a guy with a dark secret and the two embark on a rocky relationship. Based on the novel by Anna Todd.",
//        "releaseYear": "2019",
//        "price": 14.99
//}
//
//{
//       "title": "Her",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMjA1Nzk0OTM2OF5BMl5BanBnXkFtZTgwNjU2NjEwMDE@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4112492569/1434659607842-pgv4ql-1616202434010.mp4?Expires=1678086244&Signature=p7QyiGMRaVdEs3mO8y94x4Je4csnP~RjJmRsikh2S6aI52rO9p1PUgJfI2MOb5jwFuU-ZMA4HgCpVlFi3XkRJrDVwAliQihyO1Kpp2sl0943yMwPbipFglFux0E1MFn5g~erx6ecWCEuoSPo0LcvnnoX10Bpp9JFQ08nCJPYvcNnhrxSuKjAYqodjkZlfNx4H0QMoRWv-ShLcLvbWJG5FttFhqhOSPm3T-vh9bxmK-tw2i9XkwIg3bu6LgKEkN6VdV9xWFAQ1Dh-RRnT2-E04Z7vzyPaTnqZLcbw4Gu18-kNsSvlyTC16b9h8yyvb6N3BxrjIS2YpeqSTHQoxd16~A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "In a near future, a lonely writer develops an unlikely relationship with an operating system designed to meet his every need.",
//        "releaseYear": "2013",
//        "price": 7.99
//}
//
//{
//       "title": "The Theory of Everything",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTAwMTU4MDA3NDNeQTJeQWpwZ15BbWU4MDk4NTMxNTIx._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3801067289/1434659607842-pgv4ql-1616202806100.mp4?Expires=1678085931&Signature=la4vP5BHYJVbyjPjXXo5r0g7kva00b74tIGjjKRipzTtBhTE7tPATo4jfnDz84T-B34fzasbV~9wvMSMMZUalKJUids0uxvCIdPBmYSDO53y6vR8vjaSZy0oouXESC43Nok3hgZsRokpgQJh9txBkXeN3yB07UAh2-1PM5KMsEeN5MgjPz3cZLBZgpfeTqtLXAnWKQcpyPwhYZL0vNNFAsNwTP8LXbt8Lm8ZquGES7ItXuGztpiZDBLH9X4SY8j2Pl5uOfd5FJq-yuJPb0lXdZiLqIhi~SeOqGZZdnEy70DXajDwAec5ufeCPtZ6Emu7a7X3oQrs33gkopZpU7zR0w__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "A look at the relationship between the famous physicist Stephen Hawking and his wife.",
//        "releaseYear": "2014",
//        "price": 14.99
//}
//
//{
//       "title": "Father of the Bride",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOGQwMjA2NzItNmJjYS00MDQ4LWJiZmYtNjgyZjFlNTY0MjQ0XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2340667929/1434659607842-pgv4ql-1652109173353.mp4?Expires=1678086568&Signature=gsn2~8UJ30mcuELoeTZHnVTd-tBO0piy9qdX-bQssvPagUfxFZVPjcyZmzqzodhN8yJTrGfqJvVoBHoiuukOs-chhpgTxWue4G8iCUTR7lbPFwV2gz~YJya-ddEZ8NVdI6jIjl7GXtxBf3BwaQau297emv1LRzbJ7Tj654xe~LtyajjxlpXAWwkz1HL3kCUm6V7G1bFYLoJ2zZKE627ZxCn6bQmvWz2e1y1L9u-2A5z5js-UxHqgc3XIm63cD2FcCJR8PUPymWw1xSIRVrdLWGxnLRgV~3vrfj54lDzs9gqp7MWCB71DqEJCVCLbsC~OQRZJrReiOPWPkEmweUy~1Q__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "romance",
//        "description": "With his oldest daughter's wedding approaching, a father finds himself reluctant to let go.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//_______________________________
//
//{
//       "title": "Knock at the Cabin",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BZDA0MzcxZTgtMTAzZC00MGJkLTg3YzItZjMzNjkwOTVlODNlXkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2012202265/1434659607842-pgv4ql-1672034466769.mp4?Expires=1678086302&Signature=W4FrFQxXOE3VPpt8-9T2wjntFUt-kFK9wbYHbgpslVjm~~Y5-UZGRdNvj4eEBVM5kR0Qgsn-q-O8Jag0UUriSf~wnjei~dxPJhVGTyqLNZAF5mNSSfyZQR3IbDjAOAqz-tS-VVaqU3mAPM1qrvVW3W-TSVFSh5nG-vuYXkShemiU6bdl6NVoVmwe7FttV8D-znISPpfmGOV3-5ZpYhQM3UudeB3EwJexGDWEfLR~gWSf6ROTwAFmsFtinesVNawozRTgeJyDeIPEVE9FZdkRQqxdVEaoDESlck4Va9wYKn9xE0oQMcrG2v16~dYuy8ItS~aV5RvFB7h6LnsYXMYg9g__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "While vacationing, a girl and her parents are taken hostage by armed strangers who demand that the family make a choice to avert the apocalypse.",
//        "releaseYear": "2023",
//        "price": 19.99
//}
//
//{
//       "title": "X",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMTJiMmE5YWItOWZjYS00YTg0LWE0MTYtMzg2ZTY4YjNkNDEzXkEyXkFqcGdeQXVyMTAzMDg4NzU0._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi2921579289/1434659607842-pgv4ql-1641996711759.mp4?Expires=1678086833&Signature=NXqmQS0tZNgSa~UG9EQYzHxKaKAjFb85dX-Lpam36DaRUk-RnHdzQkRE7rvckNYIAhVbHFXT9nS~XcoM9ISsEo4YbzgClRALRkIvKUyzakYtNQ-vl-Ep~AgDvSfuHKlIQUMi0~tLfkRXPxqtro~9sa-01ZDUf0fh0b7SnqbtyrKkyZgcjNyDoXtgvOiCLsziBVgUAFeOev3tPOzM6D9HKe3gS~q6hgFT5f8LNreHRV6RtjpbPbKMPxBJFxKTtRk6OC-pSjcP4FPIsmEbyKqtTbb-F2u-EngJpBwfvbgRW-Q3Ysrbnzn36jiwBgWxtXvos6jY6~K9qR1UZct2Fz7z6A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "In 1979, a group of young filmmakers set out to make an adult film in rural Texas, but when their reclusive, elderly hosts catch them in the act, the cast find themselves fighting for their lives.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Watcher",
//        "moviePoster": "https://image.tmdb.org/t/p/original/t6UCz7syPrlJ2LQQBFLWiF37f19.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi3080045081/1434659607842-pgv4ql-1651105816434.mp4?Expires=1678086690&Signature=btajJc~K5h9ACCQ0a~EgNTokMgyutCmENSERi3H9CN0LhDXBdn7oiA5J840olQX0~A8PZaADDsqjYTdX8UkjKaijLADJKadRSLOwfcQjcyJJMlD7SJF4JmwNf3qEvjAx4VMoOqjhbQ8HsBl9jTzF2fmhguMs7EtMitkqX~4OLkEPuaVtzCB3pHXc1yN8qtbLwm87Tfbe~Hl4CfbNj3-8kToT37nQXtxTtdZEMS8ATcFpWnvmYvSrqfjHBImixfmx50p9RJSxhsscsKRUgONNblIXQ2kAQK4BArPV2q7zD2kJrJrv0HS~MSZKYWI2gPMX6pSU6QGbo4LSNVBKSMSxmg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "A young American woman moves with her husband to Bucharest, and begins to suspect that a stranger who watches her from the apartment building across the street may be a local serial killer decapitating women.",
//        "releaseYear": "2022",
//        "price": 12.99
//}
//
//{
//       "title": "Midsommar",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMDU0Yjk4MzQtZWRkNS00ZWJlLWI0NDUtZjJmNDE4NWU3YmNmXkEyXkFqcGdeQXVyODc0OTEyNDU@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1256832025/1434659607842-pgv4ql-1557839333541.mp4?Expires=1678086879&Signature=anANiw-vNHn82~vltBbCCkYx3ETnYmMX-JDXiLBu1ljL1-3GIyJggo3MZPMgVhgBu6AcOMEUbQgKAnHdqknGEkdPgSlq1jFUVKkTfvjEnGTNgn5Kwsd45D70U7fkfjCNsX4nqgc8erV2E8dkhWf3kxoXyR19gUD-IRXEbbwCU018YLb4UmElX4b1sXJ9IC9~ZOPg0eQ~dsiqnQZ17UHXOm-cJysvqgiPOT-vVSEIEK7impcN0gp3BPandYdfb-l9P~3c-5ZdcGHNXfshfe8EYExtF~4Is6CW4TgksmTelqEGalNo2FBMGCraxF9lDecrIHC2HxbR8alPGvw5AhI1sw__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "A couple travels to Northern Europe to visit a rural hometown's fabled Swedish mid-summer festival. What begins as an idyllic retreat quickly devolves into an increasingly violent and bizarre competition at the hands of a pagan cult.",
//        "releaseYear": "2019",
//        "price": 9.99
//}
//
//{
//       "title": "Dashcam",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BNjQ2YTcxYTctODM3Yi00ZjQ3LWE3NTctNmZiM2JhMDRjMzc0XkEyXkFqcGdeQXVyMjY5ODI4NDk@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4220830233/1434659607842-pgv4ql-1651065072715.mp4?Expires=1678087230&Signature=HVSJUD1rYZKAV0dyxTe-bKIFJwQ2jus34C7E~Tts38frsNkDjjhae1hWVKBwvYwd4Geyu7NUsxG4f4uZdBk3KX-fv7UY7QCAdBf0ndNjlh-BGh65PinLbliuSVSNj7dcfzQbx117CULEt-s0mKN0426tgoVRzDsfO5vOmtwsowIW~D1~mJfgEjCu4WCxmMwPbQdmlh~jpOWmlmZHUE~Blsa7EotvswQWNQZEn0ngJJNG3nf8X2yJXLjbE71vEXnM1cULTgp2T8dnEQa3r~MdsoTjMUBDLzTeMgF5~wBiHArl50M~JtErxZIqwR1U~hmnCsSYxfm0R13Z0J0isdAILg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "Two friends embark on a horror-fueled road trip and livestream the most terrifying night of their lives.",
//        "releaseYear": "2021",
//        "price": 14.99
//}
//
//{
//       "title": "Hereditary",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOTU5MDg3OGItZWQ1Ny00ZGVmLTg2YTUtMzBkYzQ1YWIwZjlhXkEyXkFqcGdeQXVyNTAzMTY4MDA@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi837793817/1434659607842-pgv4ql-1517322705459.mp4?Expires=1678087467&Signature=Pz0NlMLu7tI5Ra2~cGuZeEbiPjq8sEKspYK2vtHgboytJqaDZZe3DtmHSv-aDNkEcp0kawNwjFUzguhrbdgpF6V7iBo~Ex8NZvDk4t0mmF0ioQ7-cLiPwsXQQdTo8nsDngRVkeELEZVHrn8bvDYde~VczRnBK3g7tDjmJrxcZb7GuUfqI2UixxmX0ybpwQQqoTk9XfeVlehiC-nzouUgG5nU2SlL~qD6UHmvXGP9SPsDSIE9v9HsXgejcZYKVHxHswR5QK8GQylz-d9dWwCepyakVoWcxdzmOutjvZHwPiLEtrxVK-9jRwx2gxVtC65E1JjfXmRFGGvau0MpVX--Xg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "A grieving family is haunted by tragic and disturbing occurrences.",
//        "releaseYear": "2018",
//        "price": 9.99
//}
//
//{
//       "title": "M3GAN",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BMDk4MTdhYzEtODk3OS00ZDBjLWFhNTQtMDI2ODdjNzQzZTA3XkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi4277912857/1434659607842-pgv4ql-1670430750499.mp4?Expires=1678087632&Signature=aqNxQPUmAB-zKEusEvdO9Oxg~88jpe9LtislfAgeJ3HUrh47FNAkAyHrvRdpH727rz7RCXBvsgqiMTOaLY0k4YwPGiDPKCsZAXukkfHXKSJzYMGzWd1rLBBN2KYV5KY5fUseyxuS~KLyR4ZdUlWCXtmQe21bsdJU~9BpZ7GrF11FaQW~wOGuBJxMfuFmE441b53k57wGo-PWbMhu5QQTZXgAP7jXBem83YkTosvwlNpR6pWM3q1a2kBMhANwNAjn6lGyqxa5qGPBAnZysclu7y85RFKpfjLavQesbR8EiyElXTRMIMSk4lYKdis5raXkO~VA5D6ZK5VmiKvIqLX3bA__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "A robotics engineer at a toy company builds a life-like doll that begins to take on a life of its own.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Nope",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BOGJhYzAwN2MtNjA1Ny00ZjJiLWFmNzYtMDgzNTUzYjc5NTIzXkEyXkFqcGdeQXVyMTUzOTcyODA5._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1273872921/1434659607842-pgv4ql-1654787276881.mp4?Expires=1678087635&Signature=GibDYzkxi87aVFsZUfAyNi1QGZD3WwzTfpA-vD2zSMV5vOVyeMID96ljoO4dX-ocCf-YZpjqjn0k0VzUTkvIH~Pi1F4TSAPE8sWGM69bf8380FvgqaeT1UsECKHZDjgTAj3plFgDCHS6cI7cmRKm9v65kxN3CEuTto6JcVLvJlCN~87PxEnr0VgDeQdad7gZrmnH5ffrDQiQav1Lrj-1xNirzFCg~PLCAu4KonN8x3cnNAWxVPiWYC7q7nZv2bDOcOOtMlbrBxP~1mBeHzdqTTJtmgk-QF~4JxJrKD4dsKByAYGeafTnmkNRkT1EMen974JR9pTtuG8S3cS~nqmkCQ__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "The residents of a lonely gulch in inland California bear witness to an uncanny and chilling discovery.",
//        "releaseYear": "2022",
//        "price": 19.99
//}
//
//{
//       "title": "Jeepers Creepers Reborn",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BM2E0YzMwZjEtMjllNC00OGY2LTg2NDEtZjE4MzQ4YzY2OTQ3XkEyXkFqcGdeQXVyODE5MDk4NjI@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi1646969369/1434659607842-pgv4ql-1658432743033.mp4?Expires=1678088132&Signature=cSJGpE3eC4bF~BYiOIR2JHSq4dqf3mKdLoebHYiQ-rRxgJioVyazfbjSOcb50BM0DGPOguOZ8ekwW7XJ2X8v1JTCMaDFOl0pNw~UJKnxIO9-SONj5qTFBoC1DfZmoKAV0IDHZZn17Q60idAO6i87ZdbDS722zXR8UkJ~hh-Ix~t0p04DbProiFA06g20asG~q-nFNYnjNFn7NLxBwlMB40AUCyJSHZvN4qawlqTBFMEoZor27tzG1DwRukCKNgVx~VAiXi88gcFDEULbC7cGf4-6OxfcDsiKDF~cfewoRQb2aDHIIQIbtBwtFx9KK5d4mNPP8yHvZDqMk-NZZdGtPg__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "Forced to travel with her boyfriend, Laine begins to experience premonitions associated with the urban myth of The Creeper. She believes that something supernatural has been summoned - and that she is at the center of it all.",
//        "releaseYear": "2022",
//        "price": 7.99
//}
//
//{
//       "title": "It: Chapter Two",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYTJlNjlkZTktNjEwOS00NzI5LTlkNDAtZmEwZDFmYmM2MjU2XkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_FMjpg_UX1000_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi962640921/1434659607842-pgv4ql-1563466004909.mp4?Expires=1678088516&Signature=oFcEvnsspEkoOwBJiNvKTbwF5CoRW1fHOo4YEwHce1syKUjTgurd89viEE850egOvsvxiTogWTkpPt1ZXHqc-W2uqd73Xuir1EweqbRR2C1UkBWTsTdlb~xgwMz6LMepD4XuckSIC2Q6dMyYf5AcyUcv~eOyHRVCzhrCK39KRRBGp6A-i-igNcHN6bCC1084l0npgw05qUae9asmxSscZT3v~SmbOGBCN-b~smMRhH9mEMy-HJgwWMbcRa8RB70NrbnOOfua9gfKtS9qdhRYDfPOpftTFEy2p3lAL3wVeje3s8HyCihiBiVo~~cuxIbBQ~fXutXAEmZd1DnAbbGm7A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "Twenty-seven years after their first encounter with the terrifying Pennywise, the Losers Club have grown up and moved away, until a devastating phone call brings them back.",
//        "releaseYear": "2019",
//        "price": 14.99
//}
//
//{
//       "title": "Dr. Sleep",
//        "moviePoster": "https://m.media-amazon.com/images/M/MV5BYmY3NGJlYTItYmQ4OS00ZTEwLWIzODItMjMzNWU2MDE0NjZhXkEyXkFqcGdeQXVyMzQzMDA3MTI@._V1_.jpg",
//        "trailer": "https://imdb-video.media-imdb.com/vi212254489/1434659607842-pgv4ql-1567960151921.mp4?Expires=1678088897&Signature=V1uHubYL51drja6eq0bopqScFvUan9W8Fm~sc2GtXwldQZ3401-DV7m2CvDiv28qxDX~KUptV~bnl9hI68ugIcvE5z7V0YhQjYLg46wJUECAwex4DaqSTwXWNGjyLA1KUSvYwXOMg3g6dujP4St3uLYsbP2nf7NaaGVA6bYou~yAd4HGC-fd~9ybgbqpFbPh1~d8saW1vtEqhFpssPskjc6xhqejbSnke5aU0ZaGSIF525rVd-ki-CChxa95x2DpZ8ofbIUxzJ62V2oK382CqpSvnRycj9559P51MhClNVuMrqKGNx0iHUwahmDcknJrtnf8f70b5Pi8HiUJDCqU1A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA",
//        "genre": "horror",
//        "description": "Years following the events of The Shining (1980), a now-adult Dan Torrance must protect a young girl with similar powers from a cult known as The True Knot, who prey on children with powers to remain immortal.",
//        "releaseYear": "2019",
//        "price": 14.99
//}
//}
