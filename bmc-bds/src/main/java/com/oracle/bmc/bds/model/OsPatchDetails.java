/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of an os patch. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OsPatchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OsPatchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "osPatchVersion",
        "minBdsVersion",
        "minCompatibleOdhVersionMap",
        "targetPackages",
        "releaseDate",
        "patchType"
    })
    public OsPatchDetails(
            String osPatchVersion,
            String minBdsVersion,
            java.util.Map<String, String> minCompatibleOdhVersionMap,
            java.util.List<OsPatchPackageSummary> targetPackages,
            java.util.Date releaseDate,
            PatchType patchType) {
        super();
        this.osPatchVersion = osPatchVersion;
        this.minBdsVersion = minBdsVersion;
        this.minCompatibleOdhVersionMap = minCompatibleOdhVersionMap;
        this.targetPackages = targetPackages;
        this.releaseDate = releaseDate;
        this.patchType = patchType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Version of the os patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
        private String osPatchVersion;

        /**
         * Version of the os patch.
         *
         * @param osPatchVersion the value to set
         * @return this builder
         */
        public Builder osPatchVersion(String osPatchVersion) {
            this.osPatchVersion = osPatchVersion;
            this.__explicitlySet__.add("osPatchVersion");
            return this;
        }
        /** Minimum BDS version required to install current OS patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("minBdsVersion")
        private String minBdsVersion;

        /**
         * Minimum BDS version required to install current OS patch.
         *
         * @param minBdsVersion the value to set
         * @return this builder
         */
        public Builder minBdsVersion(String minBdsVersion) {
            this.minBdsVersion = minBdsVersion;
            this.__explicitlySet__.add("minBdsVersion");
            return this;
        }
        /**
         * Map of major ODH version to minimum ODH version required to install current OS patch.
         * e.g. {ODH0.9: 0.9.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minCompatibleOdhVersionMap")
        private java.util.Map<String, String> minCompatibleOdhVersionMap;

        /**
         * Map of major ODH version to minimum ODH version required to install current OS patch.
         * e.g. {ODH0.9: 0.9.1}
         *
         * @param minCompatibleOdhVersionMap the value to set
         * @return this builder
         */
        public Builder minCompatibleOdhVersionMap(
                java.util.Map<String, String> minCompatibleOdhVersionMap) {
            this.minCompatibleOdhVersionMap = minCompatibleOdhVersionMap;
            this.__explicitlySet__.add("minCompatibleOdhVersionMap");
            return this;
        }
        /** List of summaries of individual target packages. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetPackages")
        private java.util.List<OsPatchPackageSummary> targetPackages;

        /**
         * List of summaries of individual target packages.
         *
         * @param targetPackages the value to set
         * @return this builder
         */
        public Builder targetPackages(java.util.List<OsPatchPackageSummary> targetPackages) {
            this.targetPackages = targetPackages;
            this.__explicitlySet__.add("targetPackages");
            return this;
        }
        /** Released date of the OS patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private java.util.Date releaseDate;

        /**
         * Released date of the OS patch.
         *
         * @param releaseDate the value to set
         * @return this builder
         */
        public Builder releaseDate(java.util.Date releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }
        /**
         * Type of a specific os patch. REGULAR means standard released os patches. CUSTOM means os
         * patches with some customizations. EMERGENT means os patches with some emergency fixes
         * that should be prioritized.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private PatchType patchType;

        /**
         * Type of a specific os patch. REGULAR means standard released os patches. CUSTOM means os
         * patches with some customizations. EMERGENT means os patches with some emergency fixes
         * that should be prioritized.
         *
         * @param patchType the value to set
         * @return this builder
         */
        public Builder patchType(PatchType patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsPatchDetails build() {
            OsPatchDetails model =
                    new OsPatchDetails(
                            this.osPatchVersion,
                            this.minBdsVersion,
                            this.minCompatibleOdhVersionMap,
                            this.targetPackages,
                            this.releaseDate,
                            this.patchType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsPatchDetails model) {
            if (model.wasPropertyExplicitlySet("osPatchVersion")) {
                this.osPatchVersion(model.getOsPatchVersion());
            }
            if (model.wasPropertyExplicitlySet("minBdsVersion")) {
                this.minBdsVersion(model.getMinBdsVersion());
            }
            if (model.wasPropertyExplicitlySet("minCompatibleOdhVersionMap")) {
                this.minCompatibleOdhVersionMap(model.getMinCompatibleOdhVersionMap());
            }
            if (model.wasPropertyExplicitlySet("targetPackages")) {
                this.targetPackages(model.getTargetPackages());
            }
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
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

    /** Version of the os patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
    private final String osPatchVersion;

    /**
     * Version of the os patch.
     *
     * @return the value
     */
    public String getOsPatchVersion() {
        return osPatchVersion;
    }

    /** Minimum BDS version required to install current OS patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("minBdsVersion")
    private final String minBdsVersion;

    /**
     * Minimum BDS version required to install current OS patch.
     *
     * @return the value
     */
    public String getMinBdsVersion() {
        return minBdsVersion;
    }

    /**
     * Map of major ODH version to minimum ODH version required to install current OS patch. e.g.
     * {ODH0.9: 0.9.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minCompatibleOdhVersionMap")
    private final java.util.Map<String, String> minCompatibleOdhVersionMap;

    /**
     * Map of major ODH version to minimum ODH version required to install current OS patch. e.g.
     * {ODH0.9: 0.9.1}
     *
     * @return the value
     */
    public java.util.Map<String, String> getMinCompatibleOdhVersionMap() {
        return minCompatibleOdhVersionMap;
    }

    /** List of summaries of individual target packages. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetPackages")
    private final java.util.List<OsPatchPackageSummary> targetPackages;

    /**
     * List of summaries of individual target packages.
     *
     * @return the value
     */
    public java.util.List<OsPatchPackageSummary> getTargetPackages() {
        return targetPackages;
    }

    /** Released date of the OS patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final java.util.Date releaseDate;

    /**
     * Released date of the OS patch.
     *
     * @return the value
     */
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Type of a specific os patch. REGULAR means standard released os patches. CUSTOM means os
     * patches with some customizations. EMERGENT means os patches with some emergency fixes that
     * should be prioritized.
     */
    public enum PatchType implements com.oracle.bmc.http.internal.BmcEnum {
        Regular("REGULAR"),
        Custom("CUSTOM"),
        Emergent("EMERGENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchType.class);

        private final String value;
        private static java.util.Map<String, PatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchType v : PatchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of a specific os patch. REGULAR means standard released os patches. CUSTOM means os
     * patches with some customizations. EMERGENT means os patches with some emergency fixes that
     * should be prioritized.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final PatchType patchType;

    /**
     * Type of a specific os patch. REGULAR means standard released os patches. CUSTOM means os
     * patches with some customizations. EMERGENT means os patches with some emergency fixes that
     * should be prioritized.
     *
     * @return the value
     */
    public PatchType getPatchType() {
        return patchType;
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
        sb.append("OsPatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("osPatchVersion=").append(String.valueOf(this.osPatchVersion));
        sb.append(", minBdsVersion=").append(String.valueOf(this.minBdsVersion));
        sb.append(", minCompatibleOdhVersionMap=")
                .append(String.valueOf(this.minCompatibleOdhVersionMap));
        sb.append(", targetPackages=").append(String.valueOf(this.targetPackages));
        sb.append(", releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsPatchDetails)) {
            return false;
        }

        OsPatchDetails other = (OsPatchDetails) o;
        return java.util.Objects.equals(this.osPatchVersion, other.osPatchVersion)
                && java.util.Objects.equals(this.minBdsVersion, other.minBdsVersion)
                && java.util.Objects.equals(
                        this.minCompatibleOdhVersionMap, other.minCompatibleOdhVersionMap)
                && java.util.Objects.equals(this.targetPackages, other.targetPackages)
                && java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.osPatchVersion == null ? 43 : this.osPatchVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.minBdsVersion == null ? 43 : this.minBdsVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.minCompatibleOdhVersionMap == null
                                ? 43
                                : this.minCompatibleOdhVersionMap.hashCode());
        result =
                (result * PRIME)
                        + (this.targetPackages == null ? 43 : this.targetPackages.hashCode());
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
