/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The details of data source. <br>
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
        property = "dataSourceConfigType",
        defaultImpl = DataSourceConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciObjectStorageDataSourceConfig.class,
            name = "OCI_OBJECT_STORAGE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DataSourceConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldEnableMultiModality"})
    protected DataSourceConfig(Boolean shouldEnableMultiModality) {
        super();
        this.shouldEnableMultiModality = shouldEnableMultiModality;
    }

    /**
     * Flag to enable or disable multi modality such as image processing while ingestion of data.
     * True enable the processing and false exclude the multi modality contents during ingestion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableMultiModality")
    private final Boolean shouldEnableMultiModality;

    /**
     * Flag to enable or disable multi modality such as image processing while ingestion of data.
     * True enable the processing and false exclude the multi modality contents during ingestion.
     *
     * @return the value
     */
    public Boolean getShouldEnableMultiModality() {
        return shouldEnableMultiModality;
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
        sb.append("DataSourceConfig(");
        sb.append("super=").append(super.toString());
        sb.append("shouldEnableMultiModality=")
                .append(String.valueOf(this.shouldEnableMultiModality));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSourceConfig)) {
            return false;
        }

        DataSourceConfig other = (DataSourceConfig) o;
        return java.util.Objects.equals(
                        this.shouldEnableMultiModality, other.shouldEnableMultiModality)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldEnableMultiModality == null
                                ? 43
                                : this.shouldEnableMultiModality.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the tool. The allowed values are: - {@code OCI_OBJECT_STORAGE}: The data source
     * is OCI Object Storage.
     */
    public enum DataSourceConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        OciObjectStorage("OCI_OBJECT_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataSourceConfigType.class);

        private final String value;
        private static java.util.Map<String, DataSourceConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataSourceConfigType v : DataSourceConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataSourceConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataSourceConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataSourceConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
