/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about an recommended patches. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecommendedPatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecommendedPatchSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "patchId",
        "patchName",
        "patchDescription",
        "timeReleased",
        "patchType",
        "severity",
        "patchLevel"
    })
    public RecommendedPatchSummary(
            String patchId,
            String patchName,
            String patchDescription,
            java.util.Date timeReleased,
            String patchType,
            PatchSeverity severity,
            PatchLevel patchLevel) {
        super();
        this.patchId = patchId;
        this.patchName = patchName;
        this.patchDescription = patchDescription;
        this.timeReleased = timeReleased;
        this.patchType = patchType;
        this.severity = severity;
        this.patchLevel = patchLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The OCID of the patch.
         *
         * @param patchId the value to set
         * @return this builder
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /** Name of the patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * Name of the patch
         *
         * @param patchName the value to set
         * @return this builder
         */
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }
        /** Description of the patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
        private String patchDescription;

        /**
         * Description of the patch
         *
         * @param patchDescription the value to set
         * @return this builder
         */
        public Builder patchDescription(String patchDescription) {
            this.patchDescription = patchDescription;
            this.__explicitlySet__.add("patchDescription");
            return this;
        }
        /** Date on which the patch was released */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * Date on which the patch was released
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /** Description of the patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private String patchType;

        /**
         * Description of the patch
         *
         * @param patchType the value to set
         * @return this builder
         */
        public Builder patchType(String patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /** Patch Severity. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private PatchSeverity severity;

        /**
         * Patch Severity.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(PatchSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** Patch Level. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchLevel")
        private PatchLevel patchLevel;

        /**
         * Patch Level.
         *
         * @param patchLevel the value to set
         * @return this builder
         */
        public Builder patchLevel(PatchLevel patchLevel) {
            this.patchLevel = patchLevel;
            this.__explicitlySet__.add("patchLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendedPatchSummary build() {
            RecommendedPatchSummary model =
                    new RecommendedPatchSummary(
                            this.patchId,
                            this.patchName,
                            this.patchDescription,
                            this.timeReleased,
                            this.patchType,
                            this.severity,
                            this.patchLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendedPatchSummary model) {
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
            }
            if (model.wasPropertyExplicitlySet("patchDescription")) {
                this.patchDescription(model.getPatchDescription());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("patchLevel")) {
                this.patchLevel(model.getPatchLevel());
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

    /** The OCID of the patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The OCID of the patch.
     *
     * @return the value
     */
    public String getPatchId() {
        return patchId;
    }

    /** Name of the patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * Name of the patch
     *
     * @return the value
     */
    public String getPatchName() {
        return patchName;
    }

    /** Description of the patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
    private final String patchDescription;

    /**
     * Description of the patch
     *
     * @return the value
     */
    public String getPatchDescription() {
        return patchDescription;
    }

    /** Date on which the patch was released */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * Date on which the patch was released
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** Description of the patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final String patchType;

    /**
     * Description of the patch
     *
     * @return the value
     */
    public String getPatchType() {
        return patchType;
    }

    /** Patch Severity. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final PatchSeverity severity;

    /**
     * Patch Severity.
     *
     * @return the value
     */
    public PatchSeverity getSeverity() {
        return severity;
    }

    /** Patch Level. */
    public enum PatchLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Latest("LATEST"),
        LatestMinusOne("LATEST_MINUS_ONE"),
        LatestMinusTwo("LATEST_MINUS_TWO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchLevel.class);

        private final String value;
        private static java.util.Map<String, PatchLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchLevel v : PatchLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Patch Level. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchLevel")
    private final PatchLevel patchLevel;

    /**
     * Patch Level.
     *
     * @return the value
     */
    public PatchLevel getPatchLevel() {
        return patchLevel;
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
        sb.append("RecommendedPatchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("patchId=").append(String.valueOf(this.patchId));
        sb.append(", patchName=").append(String.valueOf(this.patchName));
        sb.append(", patchDescription=").append(String.valueOf(this.patchDescription));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", patchLevel=").append(String.valueOf(this.patchLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedPatchSummary)) {
            return false;
        }

        RecommendedPatchSummary other = (RecommendedPatchSummary) o;
        return java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.patchName, other.patchName)
                && java.util.Objects.equals(this.patchDescription, other.patchDescription)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.patchLevel, other.patchLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        result =
                (result * PRIME)
                        + (this.patchDescription == null ? 43 : this.patchDescription.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.patchLevel == null ? 43 : this.patchLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
