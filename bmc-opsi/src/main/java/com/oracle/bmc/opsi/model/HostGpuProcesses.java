/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * GPU processes metrics, processes using GPUs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostGpuProcesses.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostGpuProcesses extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * GPU Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
        private Integer gpuId;

        /**
         * GPU Identifier
         * @param gpuId the value to set
         * @return this builder
         **/
        public Builder gpuId(Integer gpuId) {
            this.gpuId = gpuId;
            this.__explicitlySet__.add("gpuId");
            return this;
        }
        /**
         * Process Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pid")
        private Integer pid;

        /**
         * Process Identifier
         * @param pid the value to set
         * @return this builder
         **/
        public Builder pid(Integer pid) {
            this.pid = pid;
            this.__explicitlySet__.add("pid");
            return this;
        }
        /**
         * Process Name (process using GPU)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("processName")
        private String processName;

        /**
         * Process Name (process using GPU)
         * @param processName the value to set
         * @return this builder
         **/
        public Builder processName(String processName) {
            this.processName = processName;
            this.__explicitlySet__.add("processName");
            return this;
        }
        /**
         * Process elapsed time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTime")
        private Double elapsedTime;

        /**
         * Process elapsed time
         * @param elapsedTime the value to set
         * @return this builder
         **/
        public Builder elapsedTime(Double elapsedTime) {
            this.elapsedTime = elapsedTime;
            this.__explicitlySet__.add("elapsedTime");
            return this;
        }
        /**
         * Memory Used by Process in MBs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gpuMemoryUsage")
        private Double gpuMemoryUsage;

        /**
         * Memory Used by Process in MBs
         * @param gpuMemoryUsage the value to set
         * @return this builder
         **/
        public Builder gpuMemoryUsage(Double gpuMemoryUsage) {
            this.gpuMemoryUsage = gpuMemoryUsage;
            this.__explicitlySet__.add("gpuMemoryUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostGpuProcesses build() {
            HostGpuProcesses model =
                    new HostGpuProcesses(
                            this.timeCollected,
                            this.gpuId,
                            this.pid,
                            this.processName,
                            this.elapsedTime,
                            this.gpuMemoryUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostGpuProcesses model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("gpuId")) {
                this.gpuId(model.getGpuId());
            }
            if (model.wasPropertyExplicitlySet("pid")) {
                this.pid(model.getPid());
            }
            if (model.wasPropertyExplicitlySet("processName")) {
                this.processName(model.getProcessName());
            }
            if (model.wasPropertyExplicitlySet("elapsedTime")) {
                this.elapsedTime(model.getElapsedTime());
            }
            if (model.wasPropertyExplicitlySet("gpuMemoryUsage")) {
                this.gpuMemoryUsage(model.getGpuMemoryUsage());
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

    @Deprecated
    public HostGpuProcesses(
            java.util.Date timeCollected,
            Integer gpuId,
            Integer pid,
            String processName,
            Double elapsedTime,
            Double gpuMemoryUsage) {
        super(timeCollected);
        this.gpuId = gpuId;
        this.pid = pid;
        this.processName = processName;
        this.elapsedTime = elapsedTime;
        this.gpuMemoryUsage = gpuMemoryUsage;
    }

    /**
     * GPU Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
    private final Integer gpuId;

    /**
     * GPU Identifier
     * @return the value
     **/
    public Integer getGpuId() {
        return gpuId;
    }

    /**
     * Process Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pid")
    private final Integer pid;

    /**
     * Process Identifier
     * @return the value
     **/
    public Integer getPid() {
        return pid;
    }

    /**
     * Process Name (process using GPU)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processName")
    private final String processName;

    /**
     * Process Name (process using GPU)
     * @return the value
     **/
    public String getProcessName() {
        return processName;
    }

    /**
     * Process elapsed time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTime")
    private final Double elapsedTime;

    /**
     * Process elapsed time
     * @return the value
     **/
    public Double getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Memory Used by Process in MBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuMemoryUsage")
    private final Double gpuMemoryUsage;

    /**
     * Memory Used by Process in MBs
     * @return the value
     **/
    public Double getGpuMemoryUsage() {
        return gpuMemoryUsage;
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
        sb.append("HostGpuProcesses(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", gpuId=").append(String.valueOf(this.gpuId));
        sb.append(", pid=").append(String.valueOf(this.pid));
        sb.append(", processName=").append(String.valueOf(this.processName));
        sb.append(", elapsedTime=").append(String.valueOf(this.elapsedTime));
        sb.append(", gpuMemoryUsage=").append(String.valueOf(this.gpuMemoryUsage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostGpuProcesses)) {
            return false;
        }

        HostGpuProcesses other = (HostGpuProcesses) o;
        return java.util.Objects.equals(this.gpuId, other.gpuId)
                && java.util.Objects.equals(this.pid, other.pid)
                && java.util.Objects.equals(this.processName, other.processName)
                && java.util.Objects.equals(this.elapsedTime, other.elapsedTime)
                && java.util.Objects.equals(this.gpuMemoryUsage, other.gpuMemoryUsage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.gpuId == null ? 43 : this.gpuId.hashCode());
        result = (result * PRIME) + (this.pid == null ? 43 : this.pid.hashCode());
        result = (result * PRIME) + (this.processName == null ? 43 : this.processName.hashCode());
        result = (result * PRIME) + (this.elapsedTime == null ? 43 : this.elapsedTime.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuMemoryUsage == null ? 43 : this.gpuMemoryUsage.hashCode());
        return result;
    }
}
