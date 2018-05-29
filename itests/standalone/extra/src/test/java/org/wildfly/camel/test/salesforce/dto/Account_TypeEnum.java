/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 29 09:06:51 BST 2018
 */
package org.wildfly.camel.test.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_TypeEnum {

    // Channel Partner / Reseller
    CHANNEL_PARTNER___RESELLER("Channel Partner / Reseller"),
    // Customer - Channel
    CUSTOMER___CHANNEL("Customer - Channel"),
    // Customer - Direct
    CUSTOMER___DIRECT("Customer - Direct"),
    // Installation Partner
    INSTALLATION_PARTNER("Installation Partner"),
    // Other
    OTHER("Other"),
    // Prospect
    PROSPECT("Prospect"),
    // Technology Partner
    TECHNOLOGY_PARTNER("Technology Partner");

    final String value;

    private Account_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_TypeEnum fromValue(String value) {
        for (Account_TypeEnum e : Account_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
