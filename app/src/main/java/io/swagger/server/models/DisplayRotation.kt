/**
* CulebraTester
* ## Snaky Android Test --- If you want to be able to try out the API using the **Execute** or **TRY** button from this page - an android device should be connected using `adb` - the server should have been started using `./culebratester2 start-server`  then you will be able to invoke the API and see the responses. 
*
* OpenAPI spec version: 2.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.models


/**
 *  * @param displayRotation the current display rotation*/
data class DisplayRotation (    /* the current display rotation */    val displayRotation: DisplayRotation.DisplayRotationEnum? = null
) {
    /**
    * the current display rotation
    * Values: 0,180,270,90
    */
    enum class DisplayRotationEnum(val value: kotlin.Int){
        R_0(0),
        R_180(180),
        R_270(270),
        R_90(90);
    }
}
