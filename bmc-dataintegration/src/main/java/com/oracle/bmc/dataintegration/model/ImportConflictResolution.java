/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Import Objects Conflict resolution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportConflictResolution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportConflictResolution
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "duplicatePrefix",
        "duplicateSuffix",
        "importConflictResolutionType"
    })
    public ImportConflictResolution(
            String duplicatePrefix,
            String duplicateSuffix,
            ImportConflictResolutionType importConflictResolutionType) {
        super();
        this.duplicatePrefix = duplicatePrefix;
        this.duplicateSuffix = duplicateSuffix;
        this.importConflictResolutionType = importConflictResolutionType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** In case of DUPLICATE mode, prefix will be used to disambiguate the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("duplicatePrefix")
        private String duplicatePrefix;

        /**
         * In case of DUPLICATE mode, prefix will be used to disambiguate the object.
         *
         * @param duplicatePrefix the value to set
         * @return this builder
         */
        public Builder duplicatePrefix(String duplicatePrefix) {
            this.duplicatePrefix = duplicatePrefix;
            this.__explicitlySet__.add("duplicatePrefix");
            return this;
        }
        /** In case of DUPLICATE mode, suffix will be used to disambiguate the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("duplicateSuffix")
        private String duplicateSuffix;

        /**
         * In case of DUPLICATE mode, suffix will be used to disambiguate the object.
         *
         * @param duplicateSuffix the value to set
         * @return this builder
         */
        public Builder duplicateSuffix(String duplicateSuffix) {
            this.duplicateSuffix = duplicateSuffix;
            this.__explicitlySet__.add("duplicateSuffix");
            return this;
        }
        /** Import Objects Conflict resolution Type (RETAIN/DUPLICATE/REPLACE). */
        @com.fasterxml.jackson.annotation.JsonProperty("importConflictResolutionType")
        private ImportConflictResolutionType importConflictResolutionType;

        /**
         * Import Objects Conflict resolution Type (RETAIN/DUPLICATE/REPLACE).
         *
         * @param importConflictResolutionType the value to set
         * @return this builder
         */
        public Builder importConflictResolutionType(
                ImportConflictResolutionType importConflictResolutionType) {
            this.importConflictResolutionType = importConflictResolutionType;
            this.__explicitlySet__.add("importConflictResolutionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportConflictResolution build() {
            ImportConflictResolution model =
                    new ImportConflictResolution(
                            this.duplicatePrefix,
                            this.duplicateSuffix,
                            this.importConflictResolutionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportConflictResolution model) {
            if (model.wasPropertyExplicitlySet("duplicatePrefix")) {
                this.duplicatePrefix(model.getDuplicatePrefix());
            }
            if (model.wasPropertyExplicitlySet("duplicateSuffix")) {
                this.duplicateSuffix(model.getDuplicateSuffix());
            }
            if (model.wasPropertyExplicitlySet("importConflictResolutionType")) {
                this.importConflictResolutionType(model.getImportConflictResolutionType());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** In case of DUPLICATE mode, prefix will be used to disambiguate the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("duplicatePrefix")
    private final String duplicatePrefix;

    /**
     * In case of DUPLICATE mode, prefix will be used to disambiguate the object.
     *
     * @return the value
     */
    public String getDuplicatePrefix() {
        return duplicatePrefix;
    }

    /** In case of DUPLICATE mode, suffix will be used to disambiguate the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("duplicateSuffix")
    private final String duplicateSuffix;

    /**
     * In case of DUPLICATE mode, suffix will be used to disambiguate the object.
     *
     * @return the value
     */
    public String getDuplicateSuffix() {
        return duplicateSuffix;
    }

    /** Import Objects Conflict resolution Type (RETAIN/DUPLICATE/REPLACE). */
    public enum ImportConflictResolutionType implements com.oracle.bmc.http.internal.BmcEnum {
        Duplicate("DUPLICATE"),
        Replace("REPLACE"),
        Retain("RETAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ImportConflictResolutionType.class);

        private final String value;
        private static java.util.Map<String, ImportConflictResolutionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ImportConflictResolutionType v : ImportConflictResolutionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ImportConflictResolutionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImportConflictResolutionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ImportConflictResolutionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Import Objects Conflict resolution Type (RETAIN/DUPLICATE/REPLACE). */
    @com.fasterxml.jackson.annotation.JsonProperty("importConflictResolutionType")
    private final ImportConflictResolutionType importConflictResolutionType;

    /**
     * Import Objects Conflict resolution Type (RETAIN/DUPLICATE/REPLACE).
     *
     * @return the value
     */
    public ImportConflictResolutionType getImportConflictResolutionType() {
        return importConflictResolutionType;
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
        sb.append("ImportConflictResolution(");
        sb.append("super=").append(super.toString());
        sb.append("duplicatePrefix=").append(String.valueOf(this.duplicatePrefix));
        sb.append(", duplicateSuffix=").append(String.valueOf(this.duplicateSuffix));
        sb.append(", importConflictResolutionType=")
                .append(String.valueOf(this.importConflictResolutionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportConflictResolution)) {
            return false;
        }

        ImportConflictResolution other = (ImportConflictResolution) o;
        return java.util.Objects.equals(this.duplicatePrefix, other.duplicatePrefix)
                && java.util.Objects.equals(this.duplicateSuffix, other.duplicateSuffix)
                && java.util.Objects.equals(
                        this.importConflictResolutionType, other.importConflictResolutionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.duplicatePrefix == null ? 43 : this.duplicatePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.duplicateSuffix == null ? 43 : this.duplicateSuffix.hashCode());
        result =
                (result * PRIME)
                        + (this.importConflictResolutionType == null
                                ? 43
                                : this.importConflictResolutionType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
