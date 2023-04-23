# Proto Consumer

Just a (working) example based on clojusc/protobuf's docs.

## Requirements

* [Install Clojure](https://leiningen.org/)

* Install protobuf from [here](https://protobuf.dev/downloads/) or, if on a Mac, install it [via Homebrew](https://formulae.brew.sh/formula/protobuf).

* Your protobuf version should match [protobuf-java-X.XX.XX.jar](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java) version.
* ```protoc --version``` == X.XX.XX

## Installation

Just clone and run.

## Usage

Just run with lein:

    $ lein run

Or build with:

    $ lein uberjar

And run with:

    $ java -jar target/uberjar/proto-consumer-0.1.0-SNAPSHOT-standalone.jar

### Bugs

* ```protobuf/create``` should have an overload taking no parameters but it's throwing an exception instead.

## License

Copyright © 2023 JP Silva

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
