/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * A base request type that contains common criteria for searching for resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = SearchDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StructuredSearchDetails.class,
            name = "Structured"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FreeTextSearchDetails.class,
            name = "FreeText")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SearchDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"matchingContextType"})
    protected SearchDetails(MatchingContextType matchingContextType) {
        super();
        this.matchingContextType = matchingContextType;
    }

    /**
     * The type of matching context returned in the response. If you specify {@code HIGHLIGHTS},
     * then the service will highlight fragments in its response. (For more information, see
     * ResourceSummary.searchContext and SearchContext.) The default setting is {@code NONE}.
     */
    public enum MatchingContextType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Highlights("HIGHLIGHTS"),
        ;

        private final String value;
        private static java.util.Map<String, MatchingContextType> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchingContextType v : MatchingContextType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MatchingContextType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchingContextType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MatchingContextType: " + key);
        }
    };
    /**
     * The type of matching context returned in the response. If you specify {@code HIGHLIGHTS},
     * then the service will highlight fragments in its response. (For more information, see
     * ResourceSummary.searchContext and SearchContext.) The default setting is {@code NONE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchingContextType")
    private final MatchingContextType matchingContextType;

    /**
     * The type of matching context returned in the response. If you specify {@code HIGHLIGHTS},
     * then the service will highlight fragments in its response. (For more information, see
     * ResourceSummary.searchContext and SearchContext.) The default setting is {@code NONE}.
     *
     * @return the value
     */
    public MatchingContextType getMatchingContextType() {
        return matchingContextType;
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
        sb.append("SearchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("matchingContextType=").append(String.valueOf(this.matchingContextType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchDetails)) {
            return false;
        }

        SearchDetails other = (SearchDetails) o;
        return java.util.Objects.equals(this.matchingContextType, other.matchingContextType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchingContextType == null
                                ? 43
                                : this.matchingContextType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
