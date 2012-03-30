Sample Project for [Integration Testing Web Applications using Gradle][article]
======================================================================

[article]: http://www.nofluffjuststuff.com/home/magazine_subscribe?id=33 "NFJS the Magazine, May 2012"

This project contains the source code for the article "Integration Testing Web Applications using Gradle", in the May 2012 issue of NFJS the Magazine.

The interesting part is the Gradle build file, which defines an `integrationTest` source set that is used for testing deployed applications. The build uses the `war` and `jetty` plugins to build and deploy the application.

Unit tests are also included, using the mock HTTP classes in the Spring API.

Any questions or comments should be directed to Ken Kousen at [ken.kousen@kousenit.com](mailto:ken.kousen@kousenit.com "Email Ken Kousen").