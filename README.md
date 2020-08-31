# NewsAtt
An android application showing the news using the API from newsapi.org </br>
This project uses News API for fetching the news and Retrofit ( it is a REST Client for Java and Android) as HTTP Clent request then it is parsed using google's gson library.

### Libraries
- Retrofit for sending network requests.
- Google gson For parsing JSON data.
- Glide for loading and caching images.
- PrettyTime - an OpenSource time formatting library.
- Material Design.

# Screenshot
!(https://github.com/mohitjha727/NewsAtt/blob/master/NewsAttScreenshot.jpg)

# Usage 
Get your API key by registering on https://newsapi.org/ or you can click [here](https://newsapi.org/register) to register.

You can clone this project and replace the **your api key** with your API Key in the below code in MainActivity.java file.

```
public static final String API_KEY = "your api key";
```

