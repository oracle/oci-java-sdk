/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Retention operation details for the model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RetentionOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RetentionOperationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "archiveState",
        "archiveStateDetails",
        "timeArchivalScheduled",
        "deleteState",
        "deleteStateDetails",
        "timeDeletionScheduled"
    })
    public RetentionOperationDetails(
            ModelSettingActionState archiveState,
            String archiveStateDetails,
            java.util.Date timeArchivalScheduled,
            ModelSettingActionState deleteState,
            String deleteStateDetails,
            java.util.Date timeDeletionScheduled) {
        super();
        this.archiveState = archiveState;
        this.archiveStateDetails = archiveStateDetails;
        this.timeArchivalScheduled = timeArchivalScheduled;
        this.deleteState = deleteState;
        this.deleteStateDetails = deleteStateDetails;
        this.timeDeletionScheduled = timeDeletionScheduled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The archival status of model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archiveState")
        private ModelSettingActionState archiveState;

        /**
         * The archival status of model.
         * @param archiveState the value to set
         * @return this builder
         **/
        public Builder archiveState(ModelSettingActionState archiveState) {
            this.archiveState = archiveState;
            this.__explicitlySet__.add("archiveState");
            return this;
        }
        /**
         * The archival state details of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archiveStateDetails")
        private String archiveStateDetails;

        /**
         * The archival state details of the model.
         * @param archiveStateDetails the value to set
         * @return this builder
         **/
        public Builder archiveStateDetails(String archiveStateDetails) {
            this.archiveStateDetails = archiveStateDetails;
            this.__explicitlySet__.add("archiveStateDetails");
            return this;
        }
        /**
         * The estimated archival time of the model based on the provided retention setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeArchivalScheduled")
        private java.util.Date timeArchivalScheduled;

        /**
         * The estimated archival time of the model based on the provided retention setting.
         * @param timeArchivalScheduled the value to set
         * @return this builder
         **/
        public Builder timeArchivalScheduled(java.util.Date timeArchivalScheduled) {
            this.timeArchivalScheduled = timeArchivalScheduled;
            this.__explicitlySet__.add("timeArchivalScheduled");
            return this;
        }
        /**
         * The deletion status of the archived model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleteState")
        private ModelSettingActionState deleteState;

        /**
         * The deletion status of the archived model.
         * @param deleteState the value to set
         * @return this builder
         **/
        public Builder deleteState(ModelSettingActionState deleteState) {
            this.deleteState = deleteState;
            this.__explicitlySet__.add("deleteState");
            return this;
        }
        /**
         * The deletion status details of the archived model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleteStateDetails")
        private String deleteStateDetails;

        /**
         * The deletion status details of the archived model.
         * @param deleteStateDetails the value to set
         * @return this builder
         **/
        public Builder deleteStateDetails(String deleteStateDetails) {
            this.deleteStateDetails = deleteStateDetails;
            this.__explicitlySet__.add("deleteStateDetails");
            return this;
        }
        /**
         * The estimated deletion time of the model based on the provided retention setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionScheduled")
        private java.util.Date timeDeletionScheduled;

        /**
         * The estimated deletion time of the model based on the provided retention setting.
         * @param timeDeletionScheduled the value to set
         * @return this builder
         **/
        public Builder timeDeletionScheduled(java.util.Date timeDeletionScheduled) {
            this.timeDeletionScheduled = timeDeletionScheduled;
            this.__explicitlySet__.add("timeDeletionScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetentionOperationDetails build() {
            RetentionOperationDetails model =
                    new RetentionOperationDetails(
                            this.archiveState,
                            this.archiveStateDetails,
                            this.timeArchivalScheduled,
                            this.deleteState,
                            this.deleteStateDetails,
                            this.timeDeletionScheduled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetentionOperationDetails model) {
            if (model.wasPropertyExplicitlySet("archiveState")) {
                this.archiveState(model.getArchiveState());
            }
            if (model.wasPropertyExplicitlySet("archiveStateDetails")) {
                this.archiveStateDetails(model.getArchiveStateDetails());
            }
            if (model.wasPropertyExplicitlySet("timeArchivalScheduled")) {
                this.timeArchivalScheduled(model.getTimeArchivalScheduled());
            }
            if (model.wasPropertyExplicitlySet("deleteState")) {
                this.deleteState(model.getDeleteState());
            }
            if (model.wasPropertyExplicitlySet("deleteStateDetails")) {
                this.deleteStateDetails(model.getDeleteStateDetails());
            }
            if (model.wasPropertyExplicitlySet("timeDeletionScheduled")) {
                this.timeDeletionScheduled(model.getTimeDeletionScheduled());
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
     * The archival status of model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archiveState")
    private final ModelSettingActionState archiveState;

    /**
     * The archival status of model.
     * @return the value
     **/
    public ModelSettingActionState getArchiveState() {
        return archiveState;
    }

    /**
     * The archival state details of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archiveStateDetails")
    private final String archiveStateDetails;

    /**
     * The archival state details of the model.
     * @return the value
     **/
    public String getArchiveStateDetails() {
        return archiveStateDetails;
    }

    /**
     * The estimated archival time of the model based on the provided retention setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeArchivalScheduled")
    private final java.util.Date timeArchivalScheduled;

    /**
     * The estimated archival time of the model based on the provided retention setting.
     * @return the value
     **/
    public java.util.Date getTimeArchivalScheduled() {
        return timeArchivalScheduled;
    }

    /**
     * The deletion status of the archived model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deleteState")
    private final ModelSettingActionState deleteState;

    /**
     * The deletion status of the archived model.
     * @return the value
     **/
    public ModelSettingActionState getDeleteState() {
        return deleteState;
    }

    /**
     * The deletion status details of the archived model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deleteStateDetails")
    private final String deleteStateDetails;

    /**
     * The deletion status details of the archived model.
     * @return the value
     **/
    public String getDeleteStateDetails() {
        return deleteStateDetails;
    }

    /**
     * The estimated deletion time of the model based on the provided retention setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionScheduled")
    private final java.util.Date timeDeletionScheduled;

    /**
     * The estimated deletion time of the model based on the provided retention setting.
     * @return the value
     **/
    public java.util.Date getTimeDeletionScheduled() {
        return timeDeletionScheduled;
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
        sb.append("RetentionOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("archiveState=").append(String.valueOf(this.archiveState));
        sb.append(", archiveStateDetails=").append(String.valueOf(this.archiveStateDetails));
        sb.append(", timeArchivalScheduled=").append(String.valueOf(this.timeArchivalScheduled));
        sb.append(", deleteState=").append(String.valueOf(this.deleteState));
        sb.append(", deleteStateDetails=").append(String.valueOf(this.deleteStateDetails));
        sb.append(", timeDeletionScheduled=").append(String.valueOf(this.timeDeletionScheduled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetentionOperationDetails)) {
            return false;
        }

        RetentionOperationDetails other = (RetentionOperationDetails) o;
        return java.util.Objects.equals(this.archiveState, other.archiveState)
                && java.util.Objects.equals(this.archiveStateDetails, other.archiveStateDetails)
                && java.util.Objects.equals(this.timeArchivalScheduled, other.timeArchivalScheduled)
                && java.util.Objects.equals(this.deleteState, other.deleteState)
                && java.util.Objects.equals(this.deleteStateDetails, other.deleteStateDetails)
                && java.util.Objects.equals(this.timeDeletionScheduled, other.timeDeletionScheduled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.archiveState == null ? 43 : this.archiveState.hashCode());
        result =
                (result * PRIME)
                        + (this.archiveStateDetails == null
                                ? 43
                                : this.archiveStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeArchivalScheduled == null
                                ? 43
                                : this.timeArchivalScheduled.hashCode());
        result = (result * PRIME) + (this.deleteState == null ? 43 : this.deleteState.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteStateDetails == null
                                ? 43
                                : this.deleteStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeletionScheduled == null
                                ? 43
                                : this.timeDeletionScheduled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
