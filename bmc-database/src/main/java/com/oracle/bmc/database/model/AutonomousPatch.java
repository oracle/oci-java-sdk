/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AutonomousPatch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousPatch extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "type",
        "lifecycleDetails",
        "lifecycleState",
        "timeReleased",
        "version",
        "patchModel",
        "quarter",
        "year",
        "autonomousPatchType"
    })
    public AutonomousPatch(
            String id,
            String description,
            String type,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Date timeReleased,
            String version,
            PatchModel patchModel,
            String quarter,
            String year,
            AutonomousPatchType autonomousPatchType) {
        super();
        this.id = id;
        this.description = description;
        this.type = type;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeReleased = timeReleased;
        this.version = version;
        this.patchModel = patchModel;
        this.quarter = quarter;
        this.year = year;
        this.autonomousPatchType = autonomousPatchType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The text describing this patch package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The text describing this patch package.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of patch. BUNDLE is one example.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of patch. BUNDLE is one example.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A descriptive text associated with the lifecycleState.
         * Typically can contain additional displayable text.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A descriptive text associated with the lifecycleState.
         * Typically can contain additional displayable text.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The current state of the patch as a result of lastAction.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the patch as a result of lastAction.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The date and time that the patch was released.
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * The version of this patch package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of this patch package.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Database patching model preference. See [My Oracle Support note 2285040.1](https://support.oracle.com/rs?type=doc&id=2285040.1) for information on the Release Update (RU) and Release Update Revision (RUR) patching models.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

        /**
         * Database patching model preference. See [My Oracle Support note 2285040.1](https://support.oracle.com/rs?type=doc&id=2285040.1) for information on the Release Update (RU) and Release Update Revision (RUR) patching models.
         * @param patchModel the value to set
         * @return this builder
         **/
        public Builder patchModel(PatchModel patchModel) {
            this.patchModel = patchModel;
            this.__explicitlySet__.add("patchModel");
            return this;
        }
        /**
         * First month of the quarter in which the patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quarter")
        private String quarter;

        /**
         * First month of the quarter in which the patch was released.
         * @param quarter the value to set
         * @return this builder
         **/
        public Builder quarter(String quarter) {
            this.quarter = quarter;
            this.__explicitlySet__.add("quarter");
            return this;
        }
        /**
         * Year in which the patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("year")
        private String year;

        /**
         * Year in which the patch was released.
         * @param year the value to set
         * @return this builder
         **/
        public Builder year(String year) {
            this.year = year;
            this.__explicitlySet__.add("year");
            return this;
        }
        /**
         * Maintenance run type, either "QUARTERLY" or "TIMEZONE".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousPatchType")
        private AutonomousPatchType autonomousPatchType;

        /**
         * Maintenance run type, either "QUARTERLY" or "TIMEZONE".
         *
         * @param autonomousPatchType the value to set
         * @return this builder
         **/
        public Builder autonomousPatchType(AutonomousPatchType autonomousPatchType) {
            this.autonomousPatchType = autonomousPatchType;
            this.__explicitlySet__.add("autonomousPatchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousPatch build() {
            AutonomousPatch model =
                    new AutonomousPatch(
                            this.id,
                            this.description,
                            this.type,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.timeReleased,
                            this.version,
                            this.patchModel,
                            this.quarter,
                            this.year,
                            this.autonomousPatchType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousPatch model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("patchModel")) {
                this.patchModel(model.getPatchModel());
            }
            if (model.wasPropertyExplicitlySet("quarter")) {
                this.quarter(model.getQuarter());
            }
            if (model.wasPropertyExplicitlySet("year")) {
                this.year(model.getYear());
            }
            if (model.wasPropertyExplicitlySet("autonomousPatchType")) {
                this.autonomousPatchType(model.getAutonomousPatchType());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The text describing this patch package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The text describing this patch package.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of patch. BUNDLE is one example.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of patch. BUNDLE is one example.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * A descriptive text associated with the lifecycleState.
     * Typically can contain additional displayable text.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A descriptive text associated with the lifecycleState.
     * Typically can contain additional displayable text.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The current state of the patch as a result of lastAction.
     **/
    public enum LifecycleState {
        Available("AVAILABLE"),
        Success("SUCCESS"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the patch as a result of lastAction.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the patch as a result of lastAction.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The date and time that the patch was released.
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * The version of this patch package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of this patch package.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Database patching model preference. See [My Oracle Support note 2285040.1](https://support.oracle.com/rs?type=doc&id=2285040.1) for information on the Release Update (RU) and Release Update Revision (RUR) patching models.
     **/
    public enum PatchModel {
        ReleaseUpdates("RELEASE_UPDATES"),
        ReleaseUpdateRevisions("RELEASE_UPDATE_REVISIONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchModel.class);

        private final String value;
        private static java.util.Map<String, PatchModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchModel v : PatchModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Database patching model preference. See [My Oracle Support note 2285040.1](https://support.oracle.com/rs?type=doc&id=2285040.1) for information on the Release Update (RU) and Release Update Revision (RUR) patching models.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    private final PatchModel patchModel;

    /**
     * Database patching model preference. See [My Oracle Support note 2285040.1](https://support.oracle.com/rs?type=doc&id=2285040.1) for information on the Release Update (RU) and Release Update Revision (RUR) patching models.
     * @return the value
     **/
    public PatchModel getPatchModel() {
        return patchModel;
    }

    /**
     * First month of the quarter in which the patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quarter")
    private final String quarter;

    /**
     * First month of the quarter in which the patch was released.
     * @return the value
     **/
    public String getQuarter() {
        return quarter;
    }

    /**
     * Year in which the patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("year")
    private final String year;

    /**
     * Year in which the patch was released.
     * @return the value
     **/
    public String getYear() {
        return year;
    }

    /**
     * Maintenance run type, either "QUARTERLY" or "TIMEZONE".
     *
     **/
    public enum AutonomousPatchType {
        Quarterly("QUARTERLY"),
        Timezone("TIMEZONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutonomousPatchType.class);

        private final String value;
        private static java.util.Map<String, AutonomousPatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (AutonomousPatchType v : AutonomousPatchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutonomousPatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutonomousPatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutonomousPatchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maintenance run type, either "QUARTERLY" or "TIMEZONE".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousPatchType")
    private final AutonomousPatchType autonomousPatchType;

    /**
     * Maintenance run type, either "QUARTERLY" or "TIMEZONE".
     *
     * @return the value
     **/
    public AutonomousPatchType getAutonomousPatchType() {
        return autonomousPatchType;
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
        sb.append("AutonomousPatch(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", patchModel=").append(String.valueOf(this.patchModel));
        sb.append(", quarter=").append(String.valueOf(this.quarter));
        sb.append(", year=").append(String.valueOf(this.year));
        sb.append(", autonomousPatchType=").append(String.valueOf(this.autonomousPatchType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousPatch)) {
            return false;
        }

        AutonomousPatch other = (AutonomousPatch) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.patchModel, other.patchModel)
                && java.util.Objects.equals(this.quarter, other.quarter)
                && java.util.Objects.equals(this.year, other.year)
                && java.util.Objects.equals(this.autonomousPatchType, other.autonomousPatchType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.patchModel == null ? 43 : this.patchModel.hashCode());
        result = (result * PRIME) + (this.quarter == null ? 43 : this.quarter.hashCode());
        result = (result * PRIME) + (this.year == null ? 43 : this.year.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousPatchType == null
                                ? 43
                                : this.autonomousPatchType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
