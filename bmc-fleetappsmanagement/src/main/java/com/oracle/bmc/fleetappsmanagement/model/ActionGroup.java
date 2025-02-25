/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Action Group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ActionGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActionGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "type",
        "applicationType",
        "product",
        "lifecycleOperation",
        "runbookId",
        "targetId",
        "subjects"
    })
    public ActionGroup(
            String resourceId,
            LifeCycleActionGroupType type,
            String applicationType,
            String product,
            String lifecycleOperation,
            String runbookId,
            String targetId,
            java.util.List<String> subjects) {
        super();
        this.resourceId = resourceId;
        this.type = type;
        this.applicationType = applicationType;
        this.product = product;
        this.lifecycleOperation = lifecycleOperation;
        this.runbookId = runbookId;
        this.targetId = targetId;
        this.subjects = subjects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Provide the ID of the resource. Example fleet ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Provide the ID of the resource. Example fleet ID.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * ActionGroup Type associated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private LifeCycleActionGroupType type;

        /**
         * ActionGroup Type associated.
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
         * Only applicable if type is ENVIRONMENT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        /**
         * Application Type associated.
         * Only applicable if type is ENVIRONMENT.
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
         * Only applicable if type is PRODUCT.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product associated.
         * Only applicable if type is PRODUCT.
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
         * LifeCycle Operation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
        private String lifecycleOperation;

        /**
         * LifeCycle Operation
         * @param lifecycleOperation the value to set
         * @return this builder
         **/
        public Builder lifecycleOperation(String lifecycleOperation) {
            this.lifecycleOperation = lifecycleOperation;
            this.__explicitlySet__.add("lifecycleOperation");
            return this;
        }
        /**
         * ID of the runbook
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * ID of the runbook
         * @param runbookId the value to set
         * @return this builder
         **/
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /**
         * Provide the target if schedule is created against the target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Provide the target if schedule is created against the target
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Provide subjects that need to be considered for the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjects")
        private java.util.List<String> subjects;

        /**
         * Provide subjects that need to be considered for the schedule.
         * @param subjects the value to set
         * @return this builder
         **/
        public Builder subjects(java.util.List<String> subjects) {
            this.subjects = subjects;
            this.__explicitlySet__.add("subjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionGroup build() {
            ActionGroup model =
                    new ActionGroup(
                            this.resourceId,
                            this.type,
                            this.applicationType,
                            this.product,
                            this.lifecycleOperation,
                            this.runbookId,
                            this.targetId,
                            this.subjects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionGroup model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
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
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("subjects")) {
                this.subjects(model.getSubjects());
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
     * Provide the ID of the resource. Example fleet ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Provide the ID of the resource. Example fleet ID.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * ActionGroup Type associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final LifeCycleActionGroupType type;

    /**
     * ActionGroup Type associated.
     * @return the value
     **/
    public LifeCycleActionGroupType getType() {
        return type;
    }

    /**
     * Application Type associated.
     * Only applicable if type is ENVIRONMENT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final String applicationType;

    /**
     * Application Type associated.
     * Only applicable if type is ENVIRONMENT.
     *
     * @return the value
     **/
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Product associated.
     * Only applicable if type is PRODUCT.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product associated.
     * Only applicable if type is PRODUCT.
     *
     * @return the value
     **/
    public String getProduct() {
        return product;
    }

    /**
     * LifeCycle Operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
    private final String lifecycleOperation;

    /**
     * LifeCycle Operation
     * @return the value
     **/
    public String getLifecycleOperation() {
        return lifecycleOperation;
    }

    /**
     * ID of the runbook
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * ID of the runbook
     * @return the value
     **/
    public String getRunbookId() {
        return runbookId;
    }

    /**
     * Provide the target if schedule is created against the target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Provide the target if schedule is created against the target
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Provide subjects that need to be considered for the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjects")
    private final java.util.List<String> subjects;

    /**
     * Provide subjects that need to be considered for the schedule.
     * @return the value
     **/
    public java.util.List<String> getSubjects() {
        return subjects;
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
        sb.append("ActionGroup(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", lifecycleOperation=").append(String.valueOf(this.lifecycleOperation));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", subjects=").append(String.valueOf(this.subjects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGroup)) {
            return false;
        }

        ActionGroup other = (ActionGroup) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.lifecycleOperation, other.lifecycleOperation)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.subjects, other.subjects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
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
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.subjects == null ? 43 : this.subjects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
