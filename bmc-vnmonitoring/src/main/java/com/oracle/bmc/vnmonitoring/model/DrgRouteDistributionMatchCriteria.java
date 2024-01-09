/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The match criteria in a route distribution statement. The match criteria outlines which routes
 * should be imported or exported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "matchType",
        defaultImpl = DrgRouteDistributionMatchCriteria.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DrgAttachmentIdDrgRouteDistributionMatchCriteria.class,
            name = "DRG_ATTACHMENT_ID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DrgAttachmentTypeDrgRouteDistributionMatchCriteria.class,
            name = "DRG_ATTACHMENT_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DrgAttachmentMatchAllDrgRouteDistributionMatchCriteria.class,
            name = "MATCH_ALL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DrgRouteDistributionMatchCriteria
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected DrgRouteDistributionMatchCriteria() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DrgRouteDistributionMatchCriteria(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgRouteDistributionMatchCriteria)) {
            return false;
        }

        DrgRouteDistributionMatchCriteria other = (DrgRouteDistributionMatchCriteria) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the match criteria for a route distribution statement. */
    public enum MatchType implements com.oracle.bmc.http.internal.BmcEnum {
        DrgAttachmentType("DRG_ATTACHMENT_TYPE"),
        DrgAttachmentId("DRG_ATTACHMENT_ID"),
        MatchAll("MATCH_ALL"),
        ;

        private final String value;
        private static java.util.Map<String, MatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchType v : MatchType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MatchType: " + key);
        }
    };
}
