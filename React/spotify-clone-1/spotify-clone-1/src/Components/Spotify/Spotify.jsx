/* GOAL HERE IS TO HAVE SPOTIFY HANDLE EVERYTHING FOR US */

// https://developer.spotify.com/
//First login
export const authEndpoint = "https://accounts.spotify.com/authorize";
// documentation/web-playback-sdk/quick-start/#
const clientId = "f385a7f05aea4121ba4f76dfff4ed09b";
//Will redirect you to the link below
const redirectUri = "http://localhost:3000/";

//Permissions for user
const scopes = [
    "user-read-currently-playing",
    "user-read-recently-played",
    "user-read-playback-state",
    "user-top-read",
    "user-modify-playback-state",
  ];

  export const getTokenFromUrl = () => {
    //Goes to hash
    return window.location.hash
    //getting the first substring
    .substring(1)
    //split
    .split('&')
    //initial and item is being looped
    //reduce the number to one value
    .reduce((initial, item) => {
        //split at equal sign
        let parts = item.split('=');
        //get the first substring at index 0 and decode the value after secret key
        initial[parts[0]] = decodeURIComponent(parts[1]);

        return initial;
    }, {})
  }

//   ? means endpoint, %20 adds a space
  export const loginUrl =`${authEndpoint}?client_id=${clientId}&redirect_uri=${redirectUri}&scope=${scopes.join(
    "%20"
    //give me back a token after verification
    //shows the dialog as true
  )}&response_type=token&show_dialog=true`;