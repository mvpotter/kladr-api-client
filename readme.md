[![Maven](https://jitpack.io/v/mvpotter/kladr-api-client.svg)](https://jitpack.io/#mvpotter/kladr-api-client)
[![Dependency Status](https://www.versioneye.com/user/projects/58e76d4626a5bb003f581a3c/badge.svg)](https://www.versioneye.com/user/projects/58e76d4626a5bb003f581a3c)
[![Build Status](https://travis-ci.org/mvpotter/kladr-api-client.svg)](https://travis-ci.org/mvpotter/kladr-api-client)
[![Coverage Status](https://coveralls.io/repos/github/mvpotter/kladr-api-client/badge.svg?branch=master)](https://coveralls.io/github/mvpotter/kladr-api-client?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6ac627c562bc4cb59ef92e1424b0ed1b)](https://www.codacy.com/app/mvpotter/kladr-api-client?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mvpotter/kladr-api-client&amp;utm_campaign=Badge_Grade)

# KLADR API client

Visit [https://kladr-api.ru](https://kladr-api.ru) for more info.

# Requirements

- JDK 1.7
- KLADR API token. You can get it for free [here](https://kladr-api.ru/register)

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

### Create client instance

```java
import com.mvpotter.kladrapi.KladrApiClient;

// If you have free access plan you have to use appropriate URL:
final KladrApiClient anotherFreeApiClient = new KladrApiClient(KladrApiClient.FREE_URL, "{ your API token }");
// The short form of the client above
final KladrApiClient freeApiClient = new KladrApiClient("{ your API token }");
// If you have paid plan, URL is different and client should be created the following way
final KladrApiClient anotherPaidApiClient = new KladrApiClient(KladrApiClient.PAID_URL, "{ your API token }");

```

### Perform API request

```java
final Response response = client.search(request);
```

### Requests

Every API request object implements ```com.mvpotter.kladrapi.request.Request``` interface, 
which have single method ```Map<String, String> toMap()``` 
that returns all request specific parameters as a map.
Thus, if the client does not have request type for your specific needs you can always implement it yourself. 
Of course, contributions are always welcome.

#### Building request

```java
new BuildingRequest("{ street id }", "10");
```

#### City request

```java
new CityRequest("Мос");
```

#### District request

```java
new DistrinctRequest("Ступинск");
```

#### One string request

```java
new OneStringRequest("Ленин");
```

#### Region request

```java
new RegionRequest("Московск");
```

#### Street request

```java
new StreetRequest("{ cityId }", "Ленин")
```

#### Zip request

```java
new ZipRequest("119027")
```

### Request wrappers

#### Request with type code specified

```java
new RequestWithTypeCode(new CityRequest("Бутынь"), TypeCode.VILLAGE)
```

#### Request that requires parent info to be filled in response

```java
new RequestWithParent(new CityRequest("Бутынь"))
```

#### Request with limit specified

```java
new RequestWithLimit(new CityRequest("Моск"), { limit }, [{ offset }])
```