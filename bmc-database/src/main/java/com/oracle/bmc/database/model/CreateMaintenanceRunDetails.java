/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to schedule Maintenance Run with Latest Release Update along TimeZone File Update for the
 * specified resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMaintenanceRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMaintenanceRunDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetResourceId",
        "isDstFileUpdateEnabled",
        "timeScheduled",
        "patchingMode",
        "patchType",
        "compartmentId"
    })
    public CreateMaintenanceRunDetails(
            String targetResourceId,
            Boolean isDstFileUpdateEnabled,
            java.util.Date timeScheduled,
            PatchingMode patchingMode,
            PatchType patchType,
            String compartmentId) {
        super();
        this.targetResourceId = targetResourceId;
        this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
        this.timeScheduled = timeScheduled;
        this.patchingMode = patchingMode;
        this.patchType = patchType;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the target resource for which the maintenance run should be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The ID of the target resource for which the maintenance run should be created.
         *
         * @param targetResourceId the value to set
         * @return this builder
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /**
         * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous
         * Container Database. If enabled along with Release Update, patching will be done in a
         * Non-Rolling manner.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
        private Boolean isDstFileUpdateEnabled;

        /**
         * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous
         * Container Database. If enabled along with Release Update, patching will be done in a
         * Non-Rolling manner.
         *
         * @param isDstFileUpdateEnabled the value to set
         * @return this builder
         */
        public Builder isDstFileUpdateEnabled(Boolean isDstFileUpdateEnabled) {
            this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
            this.__explicitlySet__.add("isDstFileUpdateEnabled");
            return this;
        }
        /** The date and time that update should be scheduled. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time that update should be scheduled.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         *
         * @param patchingMode the value to set
         * @return this builder
         */
        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /** Patch type, either "QUARTERLY" or "TIMEZONE". */
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private PatchType patchType;

        /**
         * Patch type, either "QUARTERLY" or "TIMEZONE".
         *
         * @param patchType the value to set
         * @return this builder
         */
        public Builder patchType(PatchType patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the Maintenance Run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the Maintenance Run.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceRunDetails build() {
            CreateMaintenanceRunDetails model =
                    new CreateMaintenanceRunDetails(
                            this.targetResourceId,
                            this.isDstFileUpdateEnabled,
                            this.timeScheduled,
                            this.patchingMode,
                            this.patchType,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceRunDetails model) {
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
            }
            if (model.wasPropertyExplicitlySet("isDstFileUpdateEnabled")) {
                this.isDstFileUpdateEnabled(model.getIsDstFileUpdateEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("patchingMode")) {
                this.patchingMode(model.getPatchingMode());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** The ID of the target resource for which the maintenance run should be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The ID of the target resource for which the maintenance run should be created.
     *
     * @return the value
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
    private final Boolean isDstFileUpdateEnabled;

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     *
     * @return the value
     */
    public Boolean getIsDstFileUpdateEnabled() {
        return isDstFileUpdateEnabled;
    }

    /** The date and time that update should be scheduled. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time that update should be scheduled.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    public enum PatchingMode implements com.oracle.bmc.http.internal.BmcEnum {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),
        ;

        private final String value;
        private static java.util.Map<String, PatchingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingMode v : PatchingMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        PatchingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PatchingMode: " + key);
        }
    };
    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingMode patchingMode;

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     *
     * @return the value
     */
    public PatchingMode getPatchingMode() {
        return patchingMode;
    }

    /** Patch type, either "QUARTERLY" or "TIMEZONE". */
    public enum PatchType implements com.oracle.bmc.http.internal.BmcEnum {
        Quarterly("QUARTERLY"),
        Timezone("TIMEZONE"),
        ;

        private final String value;
        private static java.util.Map<String, PatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchType v : PatchType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PatchType: " + key);
        }
    };
    /** Patch type, either "QUARTERLY" or "TIMEZONE". */
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final PatchType patchType;

    /**
     * Patch type, either "QUARTERLY" or "TIMEZONE".
     *
     * @return the value
     */
    public PatchType getPatchType() {
        return patchType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Maintenance Run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Maintenance Run.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("CreateMaintenanceRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", isDstFileUpdateEnabled=").append(String.valueOf(this.isDstFileUpdateEnabled));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceRunDetails)) {
            return false;
        }

        CreateMaintenanceRunDetails other = (CreateMaintenanceRunDetails) o;
        return java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(
                        this.isDstFileUpdateEnabled, other.isDstFileUpdateEnabled)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDstFileUpdateEnabled == null
                                ? 43
                                : this.isDstFileUpdateEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
