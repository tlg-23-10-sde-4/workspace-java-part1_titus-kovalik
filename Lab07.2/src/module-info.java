/*
 * A module is a collection of related packages.
 * those packages are not listed here, they are simply the ones that live here together.
 * com.entertainment
 * com.entertainment.util
 */
module com.entertainment {
    //which of my *packages are "exposed" to other java modules?
    exports com.entertainment;
}