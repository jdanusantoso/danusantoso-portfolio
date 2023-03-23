import React from "react";
import "./Home.css";
import Product from "../Product/Product";

function Home() {
  return (
    <div className="home">
      <div className="home__container">

        <h1 className="genre">Oscar Season</h1>
        <div className="home__row">
        <Product
            id="1"
            title="Inception"
            description="A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster."
            price={9.99}
            genre={"Sci-fi"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/edv5CZvWj09upOsy2Y6IwDhK8bt.jpg"
          />
        <Product
            id="3"
            title="Lord of the Ring: The Fellowship of the Ring"
            description="A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."
            price={14.99}
            genre={"Adventure"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg"
          />
          <Product
            id="8"
            title="Everything Everywhere All at Once"
            description="A middle-aged Chinese immigrant is swept up into an insane adventure in which she alone can save existence by exploring other universes and connecting with the lives she could have led."
            price={14.99}
            genre={"Action"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/w3LxiVYdWWRvEVdn5RYq6jIqkb1.jpg"
          />
          <Product
            id="41"
            title="Dunkirk"
            description="Allied soldiers from Belgium, the British Commonwealth and Empire, and France are surrounded by the German Army and evacuated during a fierce battle in WWII."
            price={14.99}
            genre={"War"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ebSnODDg9lbsMIaWg2uAbjn7TO5.jpg"
          />
          <Product
            id="66"
            title="Les Miserables"
            description="An adaptation of the stage musical based on Victor Hugo's classic novel set in 19th-century France, where a paroled prisoner named Jean Valjean seeks redemption."
            price={14.99}
            genre={"Drama"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/90PyvT7SI5INKhMC6P7B5NJVx4t.jpg"
          />
        </div>

        <h1 className="genre">Action Movies</h1>
        <div className="home__row">
        <Product
            id="6"
            title="The Batman"
            description="When a sadistic serial killer begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement."
            price={14.99}
            genre={"Action"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/74xTEgt7R36Fpooo50r9T25onhq.jpg"
          />

          <Product
            id="8"
            title="Everything Everywhere All at Once"
            description="A middle-aged Chinese immigrant is swept up into an insane adventure in which she alone can save existence by exploring other universes and connecting with the lives she could have led."
            price={14.99}
            genre={"Action"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/w3LxiVYdWWRvEVdn5RYq6jIqkb1.jpg"
          />
          <Product
            id="10"
            title="Top Gun Maverick"
            description="After thirty years, Maverick is still pushing the envelope as a top naval aviator, but must confront ghosts of his past when he leads TOP GUN's elite graduates on a mission that demands the ultimate sacrifice from those chosen to fly it."
            price={19.99}
            genre={"Action"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/62HCnUTziyWcpDaBO2i1DX17ljH.jpg"
          />

          <Product
            id="11"
            title="Doctor Strange in the Multiverse of Madness"
            description="A middle-aged Chinese immigrant is swept up into an insane adventure in which she alone can save existence by exploring other universes and connecting with the lives she could have led."
            price={9.99}
            genre={"Action"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9Gtg2DzBhmYamXBS1hKAhiwbBKS.jpg"
          />
          <Product
            id="66"
            title="Les Miserables"
            description="An adaptation of the stage musical based on Victor Hugo's classic novel set in 19th-century France, where a paroled prisoner named Jean Valjean seeks redemption."
            price={14.99}
            genre={"Drama"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/90PyvT7SI5INKhMC6P7B5NJVx4t.jpg"
          />
        </div>

        <h1 className="genre">Adventure Movies</h1>
        <div className="home__row">
          <Product
            id="2"
            title="Interstellar"
            description="The adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage."
            price={14.99}
            genre={"Adventure"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg"
          />
          <Product
            id="3"
            title="Lord of the Ring: The Fellowship of the Ring"
            description="A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."
            price={14.99}
            genre={"Adventure"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg"
          />
          <Product
            id="17"
            title="Free Guy"
            description="A bank teller discovers that he's actually an NPC inside a brutal, open world video game."
            price={19.99}
            genre={"Adventure"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg"
          />
          <Product
            id="18"
            title="Spiderman: No Way Home"
            description="With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds appear, forcing Peter to discover what it truly means to be Spider-Man."
            price={14.99}
            genre={"Adventure"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/uJYYizSuA9Y3DCs0qS4qWvHfZg4.jpg"
          />
          <Product
            id="23"
            title="No Time to Die"
            description="James Bond has left active service. His peace is short-lived when Felix Leiter, an old friend from the CIA, turns up asking for help, leading Bond onto the trail of a mysterious villain armed with dangerous new technology."
            price={19.99}
            genre={"Adventure"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iUgygt3fscRoKWCV1d0C7FbM9TP.jpg"
          />
        </div>

        <h1 className="genre">Comedy Movies</h1>
        <div className="home__row">
          <Product
            id="49"
            title="The Proposal"
            description="A pushy boss forces her young assistant to marry her in order to keep her visa status in the U.S. and avoid deportation to Canada."
            price={9.99}
            genre={"Comedy"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aYlnDia7ldvqFUst1O5S8LZeM2S.jpg"
          />
          <Product
            id="50"
            title="Jackass Forever"
            description="After 11 years, the Jackass crew is back for another crusade."
            price={14.99}
            genre={"Comedy"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ugIdyvtAzHWOguD91UjHKoAvfum.jpg"
          />
          <Product
            id="51"
            title="Dog"
            description="An army ranger and his dog embark on a road trip along the Pacific Coast Highway to attend a friend's funeral."
            price={19.99}
            genre={"Comedy"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zHQy4h36WwuCetKS7C3wcT1hkgA.jpg"
          />
          <Product
            id="52"
            title="Central Intelligence"
            description="After he reunites with an old pal through Facebook, a mild-mannered accountant is lured into the world of international espionage."
            price={14.99}
            genre={"Comedy"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7irCMBIivXAqjZ7MgZoGVLrgACR.jpg"
          />
          <Product
            id="54"
            title="Step Brothers"
            description="Two aimless middle-aged losers still living at home are forced against their will to become roommates when their parents marry."
            price={13.99}
            genre={"Comedy"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jV0eDViuTRf9cmj4H0JNvbvaNbR.jpg"
          />
        </div>

        <h1 className="genre">Drama Movies</h1>
        <div className="home__row">
          <Product
            id="61"
            title="Amsterdam"
            description="In the 1930s, three friends witness a murder, are framed for it, and uncover one of the most outrageous plots in American history."
            price={19.99}
            genre={"Drama"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6sJcVzGCwrDCBMV0DU6eRzA2UxM.jpg"
          />
          <Product
            id="65"
            title="Once Upon a Time in Hollywood"
            description="A faded television actor and his stunt double strive to achieve fame and success in the final years of Hollywood's Golden Age in 1969 LA."
            price={7.99}
            genre={"Drama"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w300_and_h450_bestv2/8j58iEBw9pOXFD2L0nt0ZXeHviB.jpg"
          />
          <Product
            id="66"
            title="Les Miserables"
            description="An adaptation of the stage musical based on Victor Hugo's classic novel set in 19th-century France, where a paroled prisoner named Jean Valjean seeks redemption."
            price={14.99}
            genre={"Drama"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/90PyvT7SI5INKhMC6P7B5NJVx4t.jpg"
          />
          <Product
            id="69"
            title="The Greatest Showman"
            description="Celebrates the birth of show business and tells of a visionary who rose from nothing to create a spectacle that became a worldwide sensation."
            price={19.99}
            genre={"Drama"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w300_and_h450_bestv2/b9CeobiihCx1uG1tpw8hXmpi7nm.jpg"
          />
          <Product
            id="71"
            title="Whiplash"
            description="Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity."
            price={13.99}
            genre={"Drama"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7fn624j5lj3xTme2SgiLCeuedmO.jpg"
          />
        </div>

        <h1 className="genre">Horror Movies</h1>
        <div className="home__row">
          <Product
            id="85"
            title="Knock at the Cabin"
            description="While vacationing, a girl and her parents are taken hostage by armed strangers who demand that the family make a choice to avert the apocalypse."
            price={7.99}
            genre={"Horror"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dm06L9pxDOL9jNSK4Cb6y139rrG.jpg"
          />
          <Product
            id="86"
            title="Halloween Ends"
            description="The saga of Michael Myers and Laurie Strode comes to a spine-chilling climax in the final installment of this trilogy."
            price={9.99}
            genre={"Horror"}
            rating={2}
            image="https://www.themoviedb.org/t/p/w300_and_h450_bestv2/q06saepaXeBdkMibuN4R2fXmgIw.jpg"
          />
          <Product
            id="93"
            title="Nope"
            description="The residents of a lonely gulch in inland California bear witness to an uncanny and chilling discovery."
            price={19.99}
            genre={"Horror"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AcKVlWaNVVVFQwro3nLXqPljcYA.jpg"
          />
          <Product
            id="95"
            title="It Chapter 2"
            description="Twenty-seven years after their first encounter with the terrifying Pennywise, the Losers Club have grown up and moved away, until a devastating phone call brings them back."
            price={14.99}
            genre={"Horror"}
            rating={3}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zfE0R94v1E8cuKAerbskfD3VfUt.jpg"
          />
          <Product
            id="71"
            title="Dr. Sleep"
            description="Years following the events of The Shining (1980), a now-adult Dan Torrance must protect a young girl with similar powers from a cult known as The True Knot, who prey on children with powers to remain immortal."
            price={14.99}
            genre={"Horror"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/p69QzIBbN06aTYqRRiCOY1emNBh.jpg"
          />
        </div>

        <h1 className="genre">Romance Movies</h1>
        <div className="home__row">
        <Product
            id="73"
            title="A Star Is Born"
            description="A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral."
            price={7.99}
            genre={"Romance"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg"
        />
        <Product
            id="75"
            title="La La Land"
            description="While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future."
            price={4.99}
            genre={"Romance"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/uDO8zWDhfWwoFdKS4fzkUJt0Rf0.jpg"
          />
          <Product
            id="79"
            title="Crazy Rich Asians"
            description="An American-born Chinese economics professor accompanies her boyfriend to Singapore for his best friend's wedding, only to get thrust into the lives of Asia's rich and famous."
            price={14.99}
            genre={"Romance"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w300_and_h450_bestv2/1XxL4LJ5WHdrcYcihEZUCgNCpAW.jpg"
          />
          <Product
            id="82"
            title="Her"
            description="In a near future, a lonely writer develops an unlikely relationship with an operating system designed to meet his every need."
            price={7.99}
            genre={"Romance"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eCOtqtfvn7mxGl6nfmq4b1exJRc.jpg"
          />
          <Product
            id="83"
            title="The Theory of Everything"
            description="A look at the relationship between the famous physicist Stephen Hawking and his wife."
            price={14.99}
            genre={"Romance"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wucOQrqihOtHToP7UAPKMFRJ9LL.jpg"
          />
        </div>

        <h1 className="genre">Sci-fi Movies</h1>
        <div className="home__row">
        <Product
            id="1"
            title="Inception"
            description="A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster."
            price={9.99}
            genre={"Sci-fi"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/edv5CZvWj09upOsy2Y6IwDhK8bt.jpg"
          />
          <Product
            id="27"
            title="The Martian"
            description="An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive and can survive until a potential rescue."
            price={14.99}
            genre={"Sci-fi"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5BHuvQ6p9kfc091Z8RiFNhCwL4b.jpg"
          />
          <Product
            id="28"
            title="Blade Runner 2049"
            description="Young Blade Runner K's discovery of a long-buried secret leads him to track down former Blade Runner Rick Deckard, who's been missing for thirty years."
            price={9.99}
            genre={"Sci-fi"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gajva2L0rPYkEWjzgFlBXCAVBE5.jpg"
          />
          <Product
            id="29"
            title="Arrival"
            description="A linguist works with the military to communicate with alien lifeforms after twelve mysterious spacecrafts appear around the world."
            price={14.99}
            genre={"Sci-fi"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/x2FJsf1ElAgr63Y3PNPtJrcmpoe.jpg"
          />
          <Product
            id="36"
            title="Ex Machina"
            description="A young programmer is selected to participate in a ground-breaking experiment in synthetic intelligence by evaluating the human qualities of a highly advanced humanoid A.I."
            price={9.99}
            genre={"Sci-fi"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dmJW8IAKHKxFNiUnoDR7JfsK7Rp.jpg"
          />
        </div>

        <h1 className="genre">War Movies</h1>
        <div className="home__row">
        <Product
            id="37"
            title="Inglorious Basterds"
            description="In Nazi-occupied France during WW2, a plan to kill Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same."
            price={3.99}
            genre={"War"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7sfbEnaARXDDhKm0CZ7D7uc2sbo.jpg"
          />
          <Product
            id="38"
            title="1917"
            description="At the height of the WW1, two young British soldiers must cross enemy territory and deliver a message that will stop a deadly attack on hundreds of soldiers."
            price={14.99}
            genre={"War"}
            rating={5}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iZf0KyrE25z1sage4SYFLCCrMi9.jpg"
          />
          <Product
            id="40"
            title="Zero Dark Thirty"
            description="A chronicle of the decade-long hunt for al-Qaeda terrorist leader Osama bin Laden after the September 2001 attacks, and his death at the hands of the Navy S.E.A.L.s Team 6 in May 2011."
            price={13.99}
            genre={"War"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/coeTvXKAYZlrcIfsCfYV5Hw1npu.jpg"
          />
          <Product
            id="41"
            title="Dunkirk"
            description="Allied soldiers from Belgium, the British Commonwealth and Empire, and France are surrounded by the German Army and evacuated during a fierce battle in WWII."
            price={14.99}
            genre={"War"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ebSnODDg9lbsMIaWg2uAbjn7TO5.jpg"
          />
          <Product
            id="42"
            title="Hacksaw Ridge"
            description="WW2 US Army Medic Desmond T. Doss, who refused to kill people at Okinawa, became the first man in US history to get the Medal of Honor without firing a shot."
            price={12.99}
            genre={"War"}
            rating={4}
            image="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jhWbYeUNOA5zAb6ufK6pXQFXqTX.jpg"
          />
        </div>
      </div>
    </div>
  );
}

export default Home;