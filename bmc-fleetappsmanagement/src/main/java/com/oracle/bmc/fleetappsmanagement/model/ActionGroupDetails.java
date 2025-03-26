/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Action Group details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActionGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActionGroupDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "name",
        "type",
        "applicationType",
        "product",
        "lifecycleOperation",
        "activityId",
        "status",
        "timeStarted",
        "timeEnded",
        "runbookId"
    })
    public ActionGroupDetails(
            String resourceId,
            String name,
            LifeCycleActionGroupType type,
            String applicationType,
            String product,
            String lifecycleOperation,
            String activityId,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String runbookId) {
        super();
        this.resourceId = resourceId;
        this.name = name;
        this.type = type;
        this.applicationType = applicationType;
        this.product = product;
        this.lifecycleOperation = lifecycleOperation;
        this.activityId = activityId;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.runbookId = runbookId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the ActionGroup resource.
         * Ex:fleetId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The ID of the ActionGroup resource.
         * Ex:fleetId.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Name of the ActionGroup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the ActionGroup.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Type of the ActionGroup
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private LifeCycleActionGroupType type;

        /**
         * Type of the ActionGroup
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(LifeCycleActionGroupType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Application Type associated.
         * Only applicable if actionGroup type is ENVIRONMENT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * Application Type associated.
         * Only applicable if actionGroup type is ENVIRONMENT.
         *
         * @param applicationType the value to set
         * @return this builder
         **/
        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /**
         * Product associated.
         * Only applicable if actionGroup type is PRODUCT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product associated.
         * Only applicable if actionGroup type is PRODUCT.
         *
         * @param product the value to set
         * @return this builder
         **/
        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * LifeCycle Operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
        private String lifecycleOperation;

        /**
         * LifeCycle Operation.
         * @param lifecycleOperation the value to set
         * @return this builder
         **/
        public Builder lifecycleOperation(String lifecycleOperation) {
            this.lifecycleOperation = lifecycleOperation;
            this.__explicitlySet__.add("lifecycleOperation");
            return this;
        }
        /**
         * Unique producer Id at Action Group Level
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activityId")
        private String activityId;

        /**
         * Unique producer Id at Action Group Level
         * @param activityId the value to set
         * @return this builder
         **/
        public Builder activityId(String activityId) {
            this.activityId = activityId;
            this.__explicitlySet__.add("activityId");
            return this;
        }
        /**
         * Status of the Job at Action Group Level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Job at Action Group Level.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The time the Scheduler Job started. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the Scheduler Job started. An RFC3339 formatted datetime string.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time the Scheduler Job ended. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the Scheduler Job ended. An RFC3339 formatted datetime string.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * OCID of the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * OCID of the runbook.
         * @param runbookId the value to set
         * @return this builder
         **/
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionGroupDetails build() {
            ActionGroupDetails model =
                    new ActionGroupDetails(
                            this.resourceId,
                            this.name,
                            this.type,
                            this.applicationType,
                            this.product,
                            this.lifecycleOperation,
                            this.activityId,
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.runbookId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionGroupDetails model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("lifecycleOperation")) {
                this.lifecycleOperation(model.getLifecycleOperation());
            }
            if (model.wasPropertyExplicitlySet("activityId")) {
                this.activityId(model.getActivityId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
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
     * The ID of the ActionGroup resource.
     * Ex:fleetId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The ID of the ActionGroup resource.
     * Ex:fleetId.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Name of the ActionGroup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the ActionGroup.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Type of the ActionGroup
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final LifeCycleActionGroupType type;

    /**
     * Type of the ActionGroup
     * @return the value
     **/
    public LifeCycleActionGroupType getType() {
        return type;
    }

    /**
     * Application Type associated.
     * Only applicable if actionGroup type is ENVIRONMENT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * Application Type associated.
     * Only applicable if actionGroup type is ENVIRONMENT.
     *
     * @return the value
     **/
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Product associated.
     * Only applicable if actionGroup type is PRODUCT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product associated.
     * Only applicable if actionGroup type is PRODUCT.
     *
     * @return the value
     **/
    public String getProduct() {
        return product;
    }

    /**
     * LifeCycle Operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
    private final String lifecycleOperation;

    /**
     * LifeCycle Operation.
     * @return the value
     **/
    public String getLifecycleOperation() {
        return lifecycleOperation;
    }

    /**
     * Unique producer Id at Action Group Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activityId")
    private final String activityId;

    /**
     * Unique producer Id at Action Group Level
     * @return the value
     **/
    public String getActivityId() {
        return activityId;
    }

    /**
     * Status of the Job at Action Group Level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Job at Action Group Level.
     * @return the value
     **/
    public JobStatus getStatus() {
        return status;
    }

    /**
     * The time the Scheduler Job started. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the Scheduler Job started. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time the Scheduler Job ended. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the Scheduler Job ended. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * OCID of the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * OCID of the runbook.
     * @return the value
     **/
    public String getRunbookId() {
        return runbookId;
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
        sb.append("ActionGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", lifecycleOperation=").append(String.valueOf(this.lifecycleOperation));
        sb.append(", activityId=").append(String.valueOf(this.activityId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGroupDetails)) {
            return false;
        }

        ActionGroupDetails other = (ActionGroupDetails) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.lifecycleOperation, other.lifecycleOperation)
                && java.util.Objects.equals(this.activityId, other.activityId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleOperation == null
                                ? 43
                                : this.lifecycleOperation.hashCode());
        result = (result * PRIME) + (this.activityId == null ? 43 : this.activityId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
