/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 29 09:06:51 BST 2018
 */
package org.wildfly.camel.test.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SLA__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_SLAEnum {

    // Bronze
    BRONZE("Bronze"),
    // Gold
    GOLD("Gold"),
    // Platinum
    PLATINUM("Platinum"),
    // Silver
    SILVER("Silver");

    final String value;

    private Account_SLAEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_SLAEnum fromValue(String value) {
        for (Account_SLAEnum e : Account_SLAEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
