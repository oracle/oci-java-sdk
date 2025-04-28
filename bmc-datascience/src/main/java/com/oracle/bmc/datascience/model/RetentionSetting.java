/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Retention setting details of the model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RetentionSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RetentionSetting
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "archiveAfterDays",
        "deleteAfterDays",
        "customerNotificationType"
    })
    public RetentionSetting(
            Integer archiveAfterDays,
            Integer deleteAfterDays,
            ModelSettingCustomerNotificationType customerNotificationType) {
        super();
        this.archiveAfterDays = archiveAfterDays;
        this.deleteAfterDays = deleteAfterDays;
        this.customerNotificationType = customerNotificationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of days after which the model will be archived. */
        @com.fasterxml.jackson.annotation.JsonProperty("archiveAfterDays")
        private Integer archiveAfterDays;

        /**
         * Number of days after which the model will be archived.
         *
         * @param archiveAfterDays the value to set
         * @return this builder
         */
        public Builder archiveAfterDays(Integer archiveAfterDays) {
            this.archiveAfterDays = archiveAfterDays;
            this.__explicitlySet__.add("archiveAfterDays");
            return this;
        }
        /** Number of days after which the archived model will be deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("deleteAfterDays")
        private Integer deleteAfterDays;

        /**
         * Number of days after which the archived model will be deleted.
         *
         * @param deleteAfterDays the value to set
         * @return this builder
         */
        public Builder deleteAfterDays(Integer deleteAfterDays) {
            this.deleteAfterDays = deleteAfterDays;
            this.__explicitlySet__.add("deleteAfterDays");
            return this;
        }
        /** Customer notification options on success/failure of archival, deletion events. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerNotificationType")
        private ModelSettingCustomerNotificationType customerNotificationType;

        /**
         * Customer notification options on success/failure of archival, deletion events.
         *
         * @param customerNotificationType the value to set
         * @return this builder
         */
        public Builder customerNotificationType(
                ModelSettingCustomerNotificationType customerNotificationType) {
            this.customerNotificationType = customerNotificationType;
            this.__explicitlySet__.add("customerNotificationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetentionSetting build() {
            RetentionSetting model =
                    new RetentionSetting(
                            this.archiveAfterDays,
                            this.deleteAfterDays,
                            this.customerNotificationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetentionSetting model) {
            if (model.wasPropertyExplicitlySet("archiveAfterDays")) {
                this.archiveAfterDays(model.getArchiveAfterDays());
            }
            if (model.wasPropertyExplicitlySet("deleteAfterDays")) {
                this.deleteAfterDays(model.getDeleteAfterDays());
            }
            if (model.wasPropertyExplicitlySet("customerNotificationType")) {
                this.customerNotificationType(model.getCustomerNotificationType());
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

    /** Number of days after which the model will be archived. */
    @com.fasterxml.jackson.annotation.JsonProperty("archiveAfterDays")
    private final Integer archiveAfterDays;

    /**
     * Number of days after which the model will be archived.
     *
     * @return the value
     */
    public Integer getArchiveAfterDays() {
        return archiveAfterDays;
    }

    /** Number of days after which the archived model will be deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteAfterDays")
    private final Integer deleteAfterDays;

    /**
     * Number of days after which the archived model will be deleted.
     *
     * @return the value
     */
    public Integer getDeleteAfterDays() {
        return deleteAfterDays;
    }

    /** Customer notification options on success/failure of archival, deletion events. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerNotificationType")
    private final ModelSettingCustomerNotificationType customerNotificationType;

    /**
     * Customer notification options on success/failure of archival, deletion events.
     *
     * @return the value
     */
    public ModelSettingCustomerNotificationType getCustomerNotificationType() {
        return customerNotificationType;
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
        sb.append("RetentionSetting(");
        sb.append("super=").append(super.toString());
        sb.append("archiveAfterDays=").append(String.valueOf(this.archiveAfterDays));
        sb.append(", deleteAfterDays=").append(String.valueOf(this.deleteAfterDays));
        sb.append(", customerNotificationType=")
                .append(String.valueOf(this.customerNotificationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetentionSetting)) {
            return false;
        }

        RetentionSetting other = (RetentionSetting) o;
        return java.util.Objects.equals(this.archiveAfterDays, other.archiveAfterDays)
                && java.util.Objects.equals(this.deleteAfterDays, other.deleteAfterDays)
                && java.util.Objects.equals(
                        this.customerNotificationType, other.customerNotificationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.archiveAfterDays == null ? 43 : this.archiveAfterDays.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteAfterDays == null ? 43 : this.deleteAfterDays.hashCode());
        result =
                (result * PRIME)
                        + (this.customerNotificationType == null
                                ? 43
                                : this.customerNotificationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
