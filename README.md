# The clojure houston website

## Usage

You must have have [Immutant](http://immutant.org/) installed.  The app was developed
using 0.8.0.  Assuming it's installed, run:

    lein immutant run
    lein immutant deploy

You can then visit the web site at http://localhost:8080/cljhouston/.  Since there isn't currently
a web interface for sending fritters, we used `curl`:

    curl -d message='Hello world!' http://localhost:8080/cljhouston/fritter
    curl -d message='Hello world again!' http://localhost:8080/cljhouston/fritter

For an example cluster, see my [January 2013 Clojure Houston](https://github.com/erewhon/chug-2013-jan)
presentation.

## License

Copyright © 2012 Contributors

Distributed under the Eclipse Public License, the same as Clojure.
