[![Maven](https://img.shields.io/github/tag/mvpotter/kladr-api-client.svg?label=maven)](https://jitpack.io/#mvpotter/kladr-api-client)
[![Build Status](https://travis-ci.org/mvpotter/kladr-api-client.svg)](https://travis-ci.org/mvpotter/kladr-api-client)

# KLADR API client

Visit [https://kladr-api.ru](https://kladr-api.ru) for more info.

# Maven

kladrapi-client is distributed using [jitpack.io](https://jitpack.io/), thus it is necessary to add jitpack repository
to your pom.xml or setting.xml file.

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependencies>
    <dependency>
        <groupId>com.github.mvpotter</groupId>
        <artifactId>kladrapi-client</artifactId>
        <version>${kladrapi-client.version}</version>
    </dependency>
</dependencies>
```

# Usage

```java
import com.mvpotter.kladrapi.KladrApiClient;
import com.mvpotter.kladrapi.request.Request;
import com.mvpotter.kladrapi.request.CityRequest;
import com.mvpotter.kladrapi.request.OneStringRequest;
import com.mvpotter.kladrapi.request.StreetRequest;
import com.mvpotter.kladrapi.request.RequestWithLimit;
import com.mvpotter.kladrapi.request.RequestWithParent;
import com.mvpotter.kladrapi.request.ZipRequest;
import com.mvpotter.kladrapi.response.Response;

// ...

KladrApiClient client = new KladrApiClient("{ your API token }");

// city request
final Request cityRequest = new CityRequest("Нов");
// street request
final Request streetRequest = new StreetRequest("{ cityId }", "Ленин");
// zip request with parent info, limited to single locality in result
final Request zipRequest = new RequestWithLimit(new RequestWithParent(new ZipRequest("630001")), 1);
// one string request
final Request oneStringRequest = new OneStringRequest("Ленин");

// make api call
final Response respones = client.search(cityRequest);

```