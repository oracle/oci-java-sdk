/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Details of deploy, update and migrate-listener(only for single Instance database) operations for
 * this resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchActivityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchActivityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deployOperationId",
        "deployTaskId",
        "deployStatus",
        "updateOperationId",
        "updateTaskId",
        "updateStatus",
        "migrateListenerOperationId",
        "migrateListenerTaskId",
        "migrateListenerStatus"
    })
    public PatchActivityDetails(
            String deployOperationId,
            String deployTaskId,
            DeployStatus deployStatus,
            String updateOperationId,
            String updateTaskId,
            UpdateStatus updateStatus,
            String migrateListenerOperationId,
            String migrateListenerTaskId,
            MigrateListenerStatus migrateListenerStatus) {
        super();
        this.deployOperationId = deployOperationId;
        this.deployTaskId = deployTaskId;
        this.deployStatus = deployStatus;
        this.updateOperationId = updateOperationId;
        this.updateTaskId = updateTaskId;
        this.updateStatus = updateStatus;
        this.migrateListenerOperationId = migrateListenerOperationId;
        this.migrateListenerTaskId = migrateListenerTaskId;
        this.migrateListenerStatus = migrateListenerStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Operation Identifier for deploy operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployOperationId")
        private String deployOperationId;

        /**
         * Operation Identifier for deploy operation.
         *
         * @param deployOperationId the value to set
         * @return this builder
         */
        public Builder deployOperationId(String deployOperationId) {
            this.deployOperationId = deployOperationId;
            this.__explicitlySet__.add("deployOperationId");
            return this;
        }
        /** Task identifier for deploy operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployTaskId")
        private String deployTaskId;

        /**
         * Task identifier for deploy operation.
         *
         * @param deployTaskId the value to set
         * @return this builder
         */
        public Builder deployTaskId(String deployTaskId) {
            this.deployTaskId = deployTaskId;
            this.__explicitlySet__.add("deployTaskId");
            return this;
        }
        /** Status of deploy operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployStatus")
        private DeployStatus deployStatus;

        /**
         * Status of deploy operation.
         *
         * @param deployStatus the value to set
         * @return this builder
         */
        public Builder deployStatus(DeployStatus deployStatus) {
            this.deployStatus = deployStatus;
            this.__explicitlySet__.add("deployStatus");
            return this;
        }
        /** Operation Identifier for update operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateOperationId")
        private String updateOperationId;

        /**
         * Operation Identifier for update operation.
         *
         * @param updateOperationId the value to set
         * @return this builder
         */
        public Builder updateOperationId(String updateOperationId) {
            this.updateOperationId = updateOperationId;
            this.__explicitlySet__.add("updateOperationId");
            return this;
        }
        /** Task identifier for update operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateTaskId")
        private String updateTaskId;

        /**
         * Task identifier for update operation.
         *
         * @param updateTaskId the value to set
         * @return this builder
         */
        public Builder updateTaskId(String updateTaskId) {
            this.updateTaskId = updateTaskId;
            this.__explicitlySet__.add("updateTaskId");
            return this;
        }
        /** Status of update operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateStatus")
        private UpdateStatus updateStatus;

        /**
         * Status of update operation.
         *
         * @param updateStatus the value to set
         * @return this builder
         */
        public Builder updateStatus(UpdateStatus updateStatus) {
            this.updateStatus = updateStatus;
            this.__explicitlySet__.add("updateStatus");
            return this;
        }
        /** Operation Identifier for migrate listener operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerOperationId")
        private String migrateListenerOperationId;

        /**
         * Operation Identifier for migrate listener operation.
         *
         * @param migrateListenerOperationId the value to set
         * @return this builder
         */
        public Builder migrateListenerOperationId(String migrateListenerOperationId) {
            this.migrateListenerOperationId = migrateListenerOperationId;
            this.__explicitlySet__.add("migrateListenerOperationId");
            return this;
        }
        /** Task identifier for migrate listener operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerTaskId")
        private String migrateListenerTaskId;

        /**
         * Task identifier for migrate listener operation.
         *
         * @param migrateListenerTaskId the value to set
         * @return this builder
         */
        public Builder migrateListenerTaskId(String migrateListenerTaskId) {
            this.migrateListenerTaskId = migrateListenerTaskId;
            this.__explicitlySet__.add("migrateListenerTaskId");
            return this;
        }
        /** Status of migrate listener operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerStatus")
        private MigrateListenerStatus migrateListenerStatus;

        /**
         * Status of migrate listener operation.
         *
         * @param migrateListenerStatus the value to set
         * @return this builder
         */
        public Builder migrateListenerStatus(MigrateListenerStatus migrateListenerStatus) {
            this.migrateListenerStatus = migrateListenerStatus;
            this.__explicitlySet__.add("migrateListenerStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchActivityDetails build() {
            PatchActivityDetails model =
                    new PatchActivityDetails(
                            this.deployOperationId,
                            this.deployTaskId,
                            this.deployStatus,
                            this.updateOperationId,
                            this.updateTaskId,
                            this.updateStatus,
                            this.migrateListenerOperationId,
                            this.migrateListenerTaskId,
                            this.migrateListenerStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchActivityDetails model) {
            if (model.wasPropertyExplicitlySet("deployOperationId")) {
                this.deployOperationId(model.getDeployOperationId());
            }
            if (model.wasPropertyExplicitlySet("deployTaskId")) {
                this.deployTaskId(model.getDeployTaskId());
            }
            if (model.wasPropertyExplicitlySet("deployStatus")) {
                this.deployStatus(model.getDeployStatus());
            }
            if (model.wasPropertyExplicitlySet("updateOperationId")) {
                this.updateOperationId(model.getUpdateOperationId());
            }
            if (model.wasPropertyExplicitlySet("updateTaskId")) {
                this.updateTaskId(model.getUpdateTaskId());
            }
            if (model.wasPropertyExplicitlySet("updateStatus")) {
                this.updateStatus(model.getUpdateStatus());
            }
            if (model.wasPropertyExplicitlySet("migrateListenerOperationId")) {
                this.migrateListenerOperationId(model.getMigrateListenerOperationId());
            }
            if (model.wasPropertyExplicitlySet("migrateListenerTaskId")) {
                this.migrateListenerTaskId(model.getMigrateListenerTaskId());
            }
            if (model.wasPropertyExplicitlySet("migrateListenerStatus")) {
                this.migrateListenerStatus(model.getMigrateListenerStatus());
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

    /** Operation Identifier for deploy operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployOperationId")
    private final String deployOperationId;

    /**
     * Operation Identifier for deploy operation.
     *
     * @return the value
     */
    public String getDeployOperationId() {
        return deployOperationId;
    }

    /** Task identifier for deploy operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployTaskId")
    private final String deployTaskId;

    /**
     * Task identifier for deploy operation.
     *
     * @return the value
     */
    public String getDeployTaskId() {
        return deployTaskId;
    }

    /** Status of deploy operation. */
    public enum DeployStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Running("RUNNING"),
        Completed("COMPLETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeployStatus.class);

        private final String value;
        private static java.util.Map<String, DeployStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DeployStatus v : DeployStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeployStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeployStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeployStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of deploy operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployStatus")
    private final DeployStatus deployStatus;

    /**
     * Status of deploy operation.
     *
     * @return the value
     */
    public DeployStatus getDeployStatus() {
        return deployStatus;
    }

    /** Operation Identifier for update operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateOperationId")
    private final String updateOperationId;

    /**
     * Operation Identifier for update operation.
     *
     * @return the value
     */
    public String getUpdateOperationId() {
        return updateOperationId;
    }

    /** Task identifier for update operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateTaskId")
    private final String updateTaskId;

    /**
     * Task identifier for update operation.
     *
     * @return the value
     */
    public String getUpdateTaskId() {
        return updateTaskId;
    }

    /** Status of update operation. */
    public enum UpdateStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Running("RUNNING"),
        Completed("COMPLETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpdateStatus.class);

        private final String value;
        private static java.util.Map<String, UpdateStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateStatus v : UpdateStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of update operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateStatus")
    private final UpdateStatus updateStatus;

    /**
     * Status of update operation.
     *
     * @return the value
     */
    public UpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    /** Operation Identifier for migrate listener operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerOperationId")
    private final String migrateListenerOperationId;

    /**
     * Operation Identifier for migrate listener operation.
     *
     * @return the value
     */
    public String getMigrateListenerOperationId() {
        return migrateListenerOperationId;
    }

    /** Task identifier for migrate listener operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerTaskId")
    private final String migrateListenerTaskId;

    /**
     * Task identifier for migrate listener operation.
     *
     * @return the value
     */
    public String getMigrateListenerTaskId() {
        return migrateListenerTaskId;
    }

    /** Status of migrate listener operation. */
    public enum MigrateListenerStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Running("RUNNING"),
        Completed("COMPLETED"),
        Failed("FAILED"),
        Na("NA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MigrateListenerStatus.class);

        private final String value;
        private static java.util.Map<String, MigrateListenerStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MigrateListenerStatus v : MigrateListenerStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MigrateListenerStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MigrateListenerStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MigrateListenerStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of migrate listener operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrateListenerStatus")
    private final MigrateListenerStatus migrateListenerStatus;

    /**
     * Status of migrate listener operation.
     *
     * @return the value
     */
    public MigrateListenerStatus getMigrateListenerStatus() {
        return migrateListenerStatus;
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
        sb.append("PatchActivityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("deployOperationId=").append(String.valueOf(this.deployOperationId));
        sb.append(", deployTaskId=").append(String.valueOf(this.deployTaskId));
        sb.append(", deployStatus=").append(String.valueOf(this.deployStatus));
        sb.append(", updateOperationId=").append(String.valueOf(this.updateOperationId));
        sb.append(", updateTaskId=").append(String.valueOf(this.updateTaskId));
        sb.append(", updateStatus=").append(String.valueOf(this.updateStatus));
        sb.append(", migrateListenerOperationId=")
                .append(String.valueOf(this.migrateListenerOperationId));
        sb.append(", migrateListenerTaskId=").append(String.valueOf(this.migrateListenerTaskId));
        sb.append(", migrateListenerStatus=").append(String.valueOf(this.migrateListenerStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchActivityDetails)) {
            return false;
        }

        PatchActivityDetails other = (PatchActivityDetails) o;
        return java.util.Objects.equals(this.deployOperationId, other.deployOperationId)
                && java.util.Objects.equals(this.deployTaskId, other.deployTaskId)
                && java.util.Objects.equals(this.deployStatus, other.deployStatus)
                && java.util.Objects.equals(this.updateOperationId, other.updateOperationId)
                && java.util.Objects.equals(this.updateTaskId, other.updateTaskId)
                && java.util.Objects.equals(this.updateStatus, other.updateStatus)
                && java.util.Objects.equals(
                        this.migrateListenerOperationId, other.migrateListenerOperationId)
                && java.util.Objects.equals(this.migrateListenerTaskId, other.migrateListenerTaskId)
                && java.util.Objects.equals(this.migrateListenerStatus, other.migrateListenerStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployOperationId == null ? 43 : this.deployOperationId.hashCode());
        result = (result * PRIME) + (this.deployTaskId == null ? 43 : this.deployTaskId.hashCode());
        result = (result * PRIME) + (this.deployStatus == null ? 43 : this.deployStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOperationId == null ? 43 : this.updateOperationId.hashCode());
        result = (result * PRIME) + (this.updateTaskId == null ? 43 : this.updateTaskId.hashCode());
        result = (result * PRIME) + (this.updateStatus == null ? 43 : this.updateStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.migrateListenerOperationId == null
                                ? 43
                                : this.migrateListenerOperationId.hashCode());
        result =
                (result * PRIME)
                        + (this.migrateListenerTaskId == null
                                ? 43
                                : this.migrateListenerTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.migrateListenerStatus == null
                                ? 43
                                : this.migrateListenerStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
