/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Defines the backup schedule details for update operation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBackupScheduleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBackupScheduleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeBackupScheduled",
        "frequencyBackupScheduled",
        "bucketName",
        "compartmentId",
        "namespaceName",
        "isMetadataOnly"
    })
    public UpdateBackupScheduleDetails(
            java.util.Date timeBackupScheduled,
            FrequencyBackupScheduled frequencyBackupScheduled,
            String bucketName,
            String compartmentId,
            String namespaceName,
            Boolean isMetadataOnly) {
        super();
        this.timeBackupScheduled = timeBackupScheduled;
        this.frequencyBackupScheduled = frequencyBackupScheduled;
        this.bucketName = bucketName;
        this.compartmentId = compartmentId;
        this.namespaceName = namespaceName;
        this.isMetadataOnly = isMetadataOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start timestamp for the deployment backup schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackupScheduled")
        private java.util.Date timeBackupScheduled;

        /**
         * The start timestamp for the deployment backup schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
         *
         * @param timeBackupScheduled the value to set
         * @return this builder
         **/
        public Builder timeBackupScheduled(java.util.Date timeBackupScheduled) {
            this.timeBackupScheduled = timeBackupScheduled;
            this.__explicitlySet__.add("timeBackupScheduled");
            return this;
        }
        /**
         * The frequency of the deployment backup schedule. Frequency can be DAILY, WEEKLY or MONTHLY.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyBackupScheduled")
        private FrequencyBackupScheduled frequencyBackupScheduled;

        /**
         * The frequency of the deployment backup schedule. Frequency can be DAILY, WEEKLY or MONTHLY.
         *
         * @param frequencyBackupScheduled the value to set
         * @return this builder
         **/
        public Builder frequencyBackupScheduled(FrequencyBackupScheduled frequencyBackupScheduled) {
            this.frequencyBackupScheduled = frequencyBackupScheduled;
            this.__explicitlySet__.add("frequencyBackupScheduled");
            return this;
        }
        /**
         * Name of the bucket where the object is to be uploaded in the object storage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the bucket where the object is to be uploaded in the object storage
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Name of namespace that serves as a container for all of your buckets
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Name of namespace that serves as a container for all of your buckets
         * @param namespaceName the value to set
         * @return this builder
         **/
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /**
         * Parameter to allow users to create backup without trails
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMetadataOnly")
        private Boolean isMetadataOnly;

        /**
         * Parameter to allow users to create backup without trails
         * @param isMetadataOnly the value to set
         * @return this builder
         **/
        public Builder isMetadataOnly(Boolean isMetadataOnly) {
            this.isMetadataOnly = isMetadataOnly;
            this.__explicitlySet__.add("isMetadataOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackupScheduleDetails build() {
            UpdateBackupScheduleDetails model =
                    new UpdateBackupScheduleDetails(
                            this.timeBackupScheduled,
                            this.frequencyBackupScheduled,
                            this.bucketName,
                            this.compartmentId,
                            this.namespaceName,
                            this.isMetadataOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackupScheduleDetails model) {
            if (model.wasPropertyExplicitlySet("timeBackupScheduled")) {
                this.timeBackupScheduled(model.getTimeBackupScheduled());
            }
            if (model.wasPropertyExplicitlySet("frequencyBackupScheduled")) {
                this.frequencyBackupScheduled(model.getFrequencyBackupScheduled());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("isMetadataOnly")) {
                this.isMetadataOnly(model.getIsMetadataOnly());
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
     * The start timestamp for the deployment backup schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackupScheduled")
    private final java.util.Date timeBackupScheduled;

    /**
     * The start timestamp for the deployment backup schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2024-10-25T18:19:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeBackupScheduled() {
        return timeBackupScheduled;
    }

    /**
     * The frequency of the deployment backup schedule. Frequency can be DAILY, WEEKLY or MONTHLY.
     *
     **/
    public enum FrequencyBackupScheduled {
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        ;

        private final String value;
        private static java.util.Map<String, FrequencyBackupScheduled> map;

        static {
            map = new java.util.HashMap<>();
            for (FrequencyBackupScheduled v : FrequencyBackupScheduled.values()) {
                map.put(v.getValue(), v);
            }
        }

        FrequencyBackupScheduled(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FrequencyBackupScheduled create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FrequencyBackupScheduled: " + key);
        }
    };
    /**
     * The frequency of the deployment backup schedule. Frequency can be DAILY, WEEKLY or MONTHLY.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyBackupScheduled")
    private final FrequencyBackupScheduled frequencyBackupScheduled;

    /**
     * The frequency of the deployment backup schedule. Frequency can be DAILY, WEEKLY or MONTHLY.
     *
     * @return the value
     **/
    public FrequencyBackupScheduled getFrequencyBackupScheduled() {
        return frequencyBackupScheduled;
    }

    /**
     * Name of the bucket where the object is to be uploaded in the object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the bucket where the object is to be uploaded in the object storage
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment being referenced.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Name of namespace that serves as a container for all of your buckets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Name of namespace that serves as a container for all of your buckets
     * @return the value
     **/
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * Parameter to allow users to create backup without trails
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetadataOnly")
    private final Boolean isMetadataOnly;

    /**
     * Parameter to allow users to create backup without trails
     * @return the value
     **/
    public Boolean getIsMetadataOnly() {
        return isMetadataOnly;
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
        sb.append("UpdateBackupScheduleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeBackupScheduled=").append(String.valueOf(this.timeBackupScheduled));
        sb.append(", frequencyBackupScheduled=")
                .append(String.valueOf(this.frequencyBackupScheduled));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", isMetadataOnly=").append(String.valueOf(this.isMetadataOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackupScheduleDetails)) {
            return false;
        }

        UpdateBackupScheduleDetails other = (UpdateBackupScheduleDetails) o;
        return java.util.Objects.equals(this.timeBackupScheduled, other.timeBackupScheduled)
                && java.util.Objects.equals(
                        this.frequencyBackupScheduled, other.frequencyBackupScheduled)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.isMetadataOnly, other.isMetadataOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeBackupScheduled == null
                                ? 43
                                : this.timeBackupScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyBackupScheduled == null
                                ? 43
                                : this.frequencyBackupScheduled.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetadataOnly == null ? 43 : this.isMetadataOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
