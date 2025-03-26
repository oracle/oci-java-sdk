/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The type of document.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DocumentType {
    Invoice("INVOICE"),
    Receipt("RECEIPT"),
    Resume("RESUME"),
    TaxForm("TAX_FORM"),
    DriverLicense("DRIVER_LICENSE"),
    Passport("PASSPORT"),
    BankStatement("BANK_STATEMENT"),
    Check("CHECK"),
    Payslip("PAYSLIP"),
    Others("OTHERS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DocumentType.class);

    private final String value;
    private static java.util.Map<String, DocumentType> map;

    static {
        map = new java.util.HashMap<>();
        for (DocumentType v : DocumentType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DocumentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DocumentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DocumentType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
