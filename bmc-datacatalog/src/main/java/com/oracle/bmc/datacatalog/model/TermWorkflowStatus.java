/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A term workflow is a sequence of steps or tasks usually done by a data steward as part of the
 * governance lifecycle. Business terms cannot be used for tagging unless they are APPROVED by the
 * busines term owner (usually a data steward). By default, most terms, when created, are in the NEW
 * status unless specified otherwise. NEW - This is the default workflow status when a term is newly
 * created. The owner can override this status during the creation. APPROVED - This term is ready
 * for use. It can be used to tag data assets, data entities, attributes, and other taggable
 * resources. UNDER_REVIEW - The term is currently under review and cannot be used until it is in
 * APPROVED status. ESCALATED - The review of this term is escalated to fast track for use in
 * tagging.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum TermWorkflowStatus implements com.oracle.bmc.http.internal.BmcEnum {
    New("NEW"),
    Approved("APPROVED"),
    UnderReview("UNDER_REVIEW"),
    Escalated("ESCALATED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TermWorkflowStatus.class);

    private final String value;
    private static java.util.Map<String, TermWorkflowStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (TermWorkflowStatus v : TermWorkflowStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TermWorkflowStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TermWorkflowStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'TermWorkflowStatus', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
