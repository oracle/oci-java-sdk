/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Summary of a package contained in a os patch.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OsPatchPackageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OsPatchPackageSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"packageName", "targetVersion", "updateType", "relatedCVEs"})
    public OsPatchPackageSummary(
            String packageName,
            String targetVersion,
            UpdateType updateType,
            java.util.List<String> relatedCVEs) {
        super();
        this.packageName = packageName;
        this.targetVersion = targetVersion;
        this.updateType = updateType;
        this.relatedCVEs = relatedCVEs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The package's name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageName")
        private String packageName;

        /**
         * The package's name.
         * @param packageName the value to set
         * @return this builder
         **/
        public Builder packageName(String packageName) {
            this.packageName = packageName;
            this.__explicitlySet__.add("packageName");
            return this;
        }
        /**
         * The target version of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
        private String targetVersion;

        /**
         * The target version of the package.
         * @param targetVersion the value to set
         * @return this builder
         **/
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            this.__explicitlySet__.add("targetVersion");
            return this;
        }
        /**
         * The action that current package will be executed on the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateType updateType;

        /**
         * The action that current package will be executed on the cluster.
         * @param updateType the value to set
         * @return this builder
         **/
        public Builder updateType(UpdateType updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /**
         * Related CVEs of the package update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCVEs")
        private java.util.List<String> relatedCVEs;

        /**
         * Related CVEs of the package update.
         * @param relatedCVEs the value to set
         * @return this builder
         **/
        public Builder relatedCVEs(java.util.List<String> relatedCVEs) {
            this.relatedCVEs = relatedCVEs;
            this.__explicitlySet__.add("relatedCVEs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsPatchPackageSummary build() {
            OsPatchPackageSummary model =
                    new OsPatchPackageSummary(
                            this.packageName,
                            this.targetVersion,
                            this.updateType,
                            this.relatedCVEs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsPatchPackageSummary model) {
            if (model.wasPropertyExplicitlySet("packageName")) {
                this.packageName(model.getPackageName());
            }
            if (model.wasPropertyExplicitlySet("targetVersion")) {
                this.targetVersion(model.getTargetVersion());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("relatedCVEs")) {
                this.relatedCVEs(model.getRelatedCVEs());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The package's name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageName")
    private final String packageName;

    /**
     * The package's name.
     * @return the value
     **/
    public String getPackageName() {
        return packageName;
    }

    /**
     * The target version of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    private final String targetVersion;

    /**
     * The target version of the package.
     * @return the value
     **/
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * The action that current package will be executed on the cluster.
     **/
    public enum UpdateType {
        Install("INSTALL"),
        Remove("REMOVE"),
        Update("UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateType.class);

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action that current package will be executed on the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateType updateType;

    /**
     * The action that current package will be executed on the cluster.
     * @return the value
     **/
    public UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Related CVEs of the package update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCVEs")
    private final java.util.List<String> relatedCVEs;

    /**
     * Related CVEs of the package update.
     * @return the value
     **/
    public java.util.List<String> getRelatedCVEs() {
        return relatedCVEs;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OsPatchPackageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("packageName=").append(String.valueOf(this.packageName));
        sb.append(", targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", relatedCVEs=").append(String.valueOf(this.relatedCVEs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsPatchPackageSummary)) {
            return false;
        }

        OsPatchPackageSummary other = (OsPatchPackageSummary) o;
        return java.util.Objects.equals(this.packageName, other.packageName)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.relatedCVEs, other.relatedCVEs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.packageName == null ? 43 : this.packageName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.relatedCVEs == null ? 43 : this.relatedCVEs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
