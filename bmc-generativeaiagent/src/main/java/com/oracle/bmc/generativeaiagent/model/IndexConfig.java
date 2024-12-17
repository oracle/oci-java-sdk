/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The index configuration of Knowledge bases. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "indexConfigType",
        defaultImpl = IndexConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DefaultIndexConfig.class,
            name = "DEFAULT_INDEX_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciDatabaseConfig.class,
            name = "OCI_DATABASE_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciOpenSearchIndexConfig.class,
            name = "OCI_OPEN_SEARCH_INDEX_CONFIG")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class IndexConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected IndexConfig() {
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
        sb.append("IndexConfig(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndexConfig)) {
            return false;
        }

        IndexConfig other = (IndexConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of index. The allowed values are: - {@code DEFAULT_INDEX_CONFIG}: DefaultIndexConfig
     * allows the service to create and manage vector store on behalf of the customer. - {@code
     * OCI_OPEN_SEARCH_INDEX_CONFIG}: OciOpenSearchIndexConfig allows customer to configure their
     * OpenSearch cluster. - {@code OCI_DATABASE_CONFIG}: OciDatabaseConfig allows customer to
     * configure their Database.
     */
    public enum IndexConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        DefaultIndexConfig("DEFAULT_INDEX_CONFIG"),
        OciOpenSearchIndexConfig("OCI_OPEN_SEARCH_INDEX_CONFIG"),
        OciDatabaseConfig("OCI_DATABASE_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IndexConfigType.class);

        private final String value;
        private static java.util.Map<String, IndexConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (IndexConfigType v : IndexConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IndexConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IndexConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IndexConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
