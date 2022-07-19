/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information about a RoverWorkload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoverWorkload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoverWorkload {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "compartmentId",
        "id",
        "size",
        "objectCount",
        "prefix",
        "rangeStart",
        "rangeEnd",
        "workloadType",
        "workRequestId"
    })
    public RoverWorkload(
            String name,
            String compartmentId,
            String id,
            String size,
            String objectCount,
            String prefix,
            String rangeStart,
            String rangeEnd,
            String workloadType,
            String workRequestId) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.id = id;
        this.size = size;
        this.objectCount = objectCount;
        this.prefix = prefix;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.workloadType = workloadType;
        this.workRequestId = workRequestId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the Rover Workload
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Rover Workload
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the compartment containing the workload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the workload.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Unique Oracle ID (OCID) that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Unique Oracle ID (OCID) that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Size of the workload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private String size;

        /**
         * Size of the workload.
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(String size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * Number of objects in a workload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
        private String objectCount;

        /**
         * Number of objects in a workload.
         * @param objectCount the value to set
         * @return this builder
         **/
        public Builder objectCount(String objectCount) {
            this.objectCount = objectCount;
            this.__explicitlySet__.add("objectCount");
            return this;
        }
        /**
         * Prefix to filter objects in case it is a bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Prefix to filter objects in case it is a bucket.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * Start of the range in a bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
        private String rangeStart;

        /**
         * Start of the range in a bucket.
         * @param rangeStart the value to set
         * @return this builder
         **/
        public Builder rangeStart(String rangeStart) {
            this.rangeStart = rangeStart;
            this.__explicitlySet__.add("rangeStart");
            return this;
        }
        /**
         * End of the range in a bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
        private String rangeEnd;

        /**
         * End of the range in a bucket.
         * @param rangeEnd the value to set
         * @return this builder
         **/
        public Builder rangeEnd(String rangeEnd) {
            this.rangeEnd = rangeEnd;
            this.__explicitlySet__.add("rangeEnd");
            return this;
        }
        /**
         * The type of workload
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private String workloadType;

        /**
         * The type of workload
         * @param workloadType the value to set
         * @return this builder
         **/
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /**
         * The compute work request id to track progress of custom image exports.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The compute work request id to track progress of custom image exports.
         * @param workRequestId the value to set
         * @return this builder
         **/
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverWorkload build() {
            RoverWorkload __instance__ =
                    new RoverWorkload(
                            name,
                            compartmentId,
                            id,
                            size,
                            objectCount,
                            prefix,
                            rangeStart,
                            rangeEnd,
                            workloadType,
                            workRequestId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverWorkload o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .id(o.getId())
                            .size(o.getSize())
                            .objectCount(o.getObjectCount())
                            .prefix(o.getPrefix())
                            .rangeStart(o.getRangeStart())
                            .rangeEnd(o.getRangeEnd())
                            .workloadType(o.getWorkloadType())
                            .workRequestId(o.getWorkRequestId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Name of the Rover Workload
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Rover Workload
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the compartment containing the workload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the workload.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Unique Oracle ID (OCID) that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Unique Oracle ID (OCID) that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Size of the workload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final String size;

    /**
     * Size of the workload.
     * @return the value
     **/
    public String getSize() {
        return size;
    }

    /**
     * Number of objects in a workload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
    private final String objectCount;

    /**
     * Number of objects in a workload.
     * @return the value
     **/
    public String getObjectCount() {
        return objectCount;
    }

    /**
     * Prefix to filter objects in case it is a bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Prefix to filter objects in case it is a bucket.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * Start of the range in a bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    private final String rangeStart;

    /**
     * Start of the range in a bucket.
     * @return the value
     **/
    public String getRangeStart() {
        return rangeStart;
    }

    /**
     * End of the range in a bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    private final String rangeEnd;

    /**
     * End of the range in a bucket.
     * @return the value
     **/
    public String getRangeEnd() {
        return rangeEnd;
    }

    /**
     * The type of workload
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final String workloadType;

    /**
     * The type of workload
     * @return the value
     **/
    public String getWorkloadType() {
        return workloadType;
    }

    /**
     * The compute work request id to track progress of custom image exports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The compute work request id to track progress of custom image exports.
     * @return the value
     **/
    public String getWorkRequestId() {
        return workRequestId;
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
        sb.append("RoverWorkload(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", rangeStart=").append(String.valueOf(this.rangeStart));
        sb.append(", rangeEnd=").append(String.valueOf(this.rangeEnd));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverWorkload)) {
            return false;
        }

        RoverWorkload other = (RoverWorkload) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.objectCount, other.objectCount)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.rangeStart, other.rangeStart)
                && java.util.Objects.equals(this.rangeEnd, other.rangeEnd)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.objectCount == null ? 43 : this.objectCount.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.rangeStart == null ? 43 : this.rangeStart.hashCode());
        result = (result * PRIME) + (this.rangeEnd == null ? 43 : this.rangeEnd.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
