/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The source of subsetting schemas <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "schemaSource",
        defaultImpl = SchemaSourceDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SchemaSourceFromTargetDetails.class,
            name = "TARGET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SchemaSourceFromSdmDetails.class,
            name = "SENSITIVE_DATA_MODEL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SchemaSourceDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"schemasForSubsetting", "derivedSchemas"})
    protected SchemaSourceDetails(
            java.util.List<String> schemasForSubsetting, java.util.List<String> derivedSchemas) {
        super();
        this.schemasForSubsetting = schemasForSubsetting;
        this.derivedSchemas = derivedSchemas;
    }

    /** The schemas to be subsetted */
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForSubsetting")
    private final java.util.List<String> schemasForSubsetting;

    /**
     * The schemas to be subsetted
     *
     * @return the value
     */
    public java.util.List<String> getSchemasForSubsetting() {
        return schemasForSubsetting;
    }

    /**
     * The schemas which are related to the input list of schemas in 'schemasForSubsetting'. These
     * schemas can also be impacted from the subsetting process due to their relations with the
     * schemas in 'schemasForSubsetting'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedSchemas")
    private final java.util.List<String> derivedSchemas;

    /**
     * The schemas which are related to the input list of schemas in 'schemasForSubsetting'. These
     * schemas can also be impacted from the subsetting process due to their relations with the
     * schemas in 'schemasForSubsetting'
     *
     * @return the value
     */
    public java.util.List<String> getDerivedSchemas() {
        return derivedSchemas;
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
        sb.append("SchemaSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("schemasForSubsetting=").append(String.valueOf(this.schemasForSubsetting));
        sb.append(", derivedSchemas=").append(String.valueOf(this.derivedSchemas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaSourceDetails)) {
            return false;
        }

        SchemaSourceDetails other = (SchemaSourceDetails) o;
        return java.util.Objects.equals(this.schemasForSubsetting, other.schemasForSubsetting)
                && java.util.Objects.equals(this.derivedSchemas, other.derivedSchemas)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.schemasForSubsetting == null
                                ? 43
                                : this.schemasForSubsetting.hashCode());
        result =
                (result * PRIME)
                        + (this.derivedSchemas == null ? 43 : this.derivedSchemas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The source of subsetting schemas */
    public enum SchemaSource implements com.oracle.bmc.http.internal.BmcEnum {
        Target("TARGET"),
        SensitiveDataModel("SENSITIVE_DATA_MODEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SchemaSource.class);

        private final String value;
        private static java.util.Map<String, SchemaSource> map;

        static {
            map = new java.util.HashMap<>();
            for (SchemaSource v : SchemaSource.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SchemaSource(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SchemaSource create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SchemaSource', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
