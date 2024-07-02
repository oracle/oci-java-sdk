/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * GPU performance metrics <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostGpuUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostGpuUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** GPU Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
        private Integer gpuId;

        /**
         * GPU Identifier
         *
         * @param gpuId the value to set
         * @return this builder
         */
        public Builder gpuId(Integer gpuId) {
            this.gpuId = gpuId;
            this.__explicitlySet__.add("gpuId");
            return this;
        }
        /** GPU Utilization Percent */
        @com.fasterxml.jackson.annotation.JsonProperty("utilization")
        private Double utilization;

        /**
         * GPU Utilization Percent
         *
         * @param utilization the value to set
         * @return this builder
         */
        public Builder utilization(Double utilization) {
            this.utilization = utilization;
            this.__explicitlySet__.add("utilization");
            return this;
        }
        /** GPU Memory Utilization Percent */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
        private Double memoryUtilization;

        /**
         * GPU Memory Utilization Percent
         *
         * @param memoryUtilization the value to set
         * @return this builder
         */
        public Builder memoryUtilization(Double memoryUtilization) {
            this.memoryUtilization = memoryUtilization;
            this.__explicitlySet__.add("memoryUtilization");
            return this;
        }
        /** GPU Power Draw in Watts */
        @com.fasterxml.jackson.annotation.JsonProperty("powerDraw")
        private Double powerDraw;

        /**
         * GPU Power Draw in Watts
         *
         * @param powerDraw the value to set
         * @return this builder
         */
        public Builder powerDraw(Double powerDraw) {
            this.powerDraw = powerDraw;
            this.__explicitlySet__.add("powerDraw");
            return this;
        }
        /** GPU Temperature in Celsius */
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Double temperature;

        /**
         * GPU Temperature in Celsius
         *
         * @param temperature the value to set
         * @return this builder
         */
        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            this.__explicitlySet__.add("temperature");
            return this;
        }
        /** GPU Fan Utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("fanUtilization")
        private Double fanUtilization;

        /**
         * GPU Fan Utilization
         *
         * @param fanUtilization the value to set
         * @return this builder
         */
        public Builder fanUtilization(Double fanUtilization) {
            this.fanUtilization = fanUtilization;
            this.__explicitlySet__.add("fanUtilization");
            return this;
        }
        /** GPU Graphics (Shader) Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedGraphics")
        private Double clockSpeedGraphics;

        /**
         * GPU Graphics (Shader) Clock Speed
         *
         * @param clockSpeedGraphics the value to set
         * @return this builder
         */
        public Builder clockSpeedGraphics(Double clockSpeedGraphics) {
            this.clockSpeedGraphics = clockSpeedGraphics;
            this.__explicitlySet__.add("clockSpeedGraphics");
            return this;
        }
        /** GPU SM (Streaming Multiprocessor) Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedSm")
        private Double clockSpeedSm;

        /**
         * GPU SM (Streaming Multiprocessor) Clock Speed
         *
         * @param clockSpeedSm the value to set
         * @return this builder
         */
        public Builder clockSpeedSm(Double clockSpeedSm) {
            this.clockSpeedSm = clockSpeedSm;
            this.__explicitlySet__.add("clockSpeedSm");
            return this;
        }
        /** GPU Video Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedVideo")
        private Double clockSpeedVideo;

        /**
         * GPU Video Clock Speed
         *
         * @param clockSpeedVideo the value to set
         * @return this builder
         */
        public Builder clockSpeedVideo(Double clockSpeedVideo) {
            this.clockSpeedVideo = clockSpeedVideo;
            this.__explicitlySet__.add("clockSpeedVideo");
            return this;
        }
        /** GPU Memory Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedMemory")
        private Double clockSpeedMemory;

        /**
         * GPU Memory Clock Speed
         *
         * @param clockSpeedMemory the value to set
         * @return this builder
         */
        public Builder clockSpeedMemory(Double clockSpeedMemory) {
            this.clockSpeedMemory = clockSpeedMemory;
            this.__explicitlySet__.add("clockSpeedMemory");
            return this;
        }
        /** GPU Performance State */
        @com.fasterxml.jackson.annotation.JsonProperty("performanceState")
        private Double performanceState;

        /**
         * GPU Performance State
         *
         * @param performanceState the value to set
         * @return this builder
         */
        public Builder performanceState(Double performanceState) {
            this.performanceState = performanceState;
            this.__explicitlySet__.add("performanceState");
            return this;
        }
        /** GPU ECC Single Bit Errors */
        @com.fasterxml.jackson.annotation.JsonProperty("eccSingleBitErrors")
        private Integer eccSingleBitErrors;

        /**
         * GPU ECC Single Bit Errors
         *
         * @param eccSingleBitErrors the value to set
         * @return this builder
         */
        public Builder eccSingleBitErrors(Integer eccSingleBitErrors) {
            this.eccSingleBitErrors = eccSingleBitErrors;
            this.__explicitlySet__.add("eccSingleBitErrors");
            return this;
        }
        /** GPU ECC Double Bit Errors */
        @com.fasterxml.jackson.annotation.JsonProperty("eccDoubleBitErrors")
        private Integer eccDoubleBitErrors;

        /**
         * GPU ECC Double Bit Errors
         *
         * @param eccDoubleBitErrors the value to set
         * @return this builder
         */
        public Builder eccDoubleBitErrors(Integer eccDoubleBitErrors) {
            this.eccDoubleBitErrors = eccDoubleBitErrors;
            this.__explicitlySet__.add("eccDoubleBitErrors");
            return this;
        }
        /** Nothing running on CPU, clocks are idle */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventIdle")
        private Integer clockEventIdle;

        /**
         * Nothing running on CPU, clocks are idle
         *
         * @param clockEventIdle the value to set
         * @return this builder
         */
        public Builder clockEventIdle(Integer clockEventIdle) {
            this.clockEventIdle = clockEventIdle;
            this.__explicitlySet__.add("clockEventIdle");
            return this;
        }
        /**
         * HW Thermal Slowdown (reducing the core clocks by a factor of 2 or more) is engaged. Temp
         * too high
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventHwThermalSlowDown")
        private Integer clockEventHwThermalSlowDown;

        /**
         * HW Thermal Slowdown (reducing the core clocks by a factor of 2 or more) is engaged. Temp
         * too high
         *
         * @param clockEventHwThermalSlowDown the value to set
         * @return this builder
         */
        public Builder clockEventHwThermalSlowDown(Integer clockEventHwThermalSlowDown) {
            this.clockEventHwThermalSlowDown = clockEventHwThermalSlowDown;
            this.__explicitlySet__.add("clockEventHwThermalSlowDown");
            return this;
        }
        /**
         * SW Power Scaling algorithm is reducing the clocks below requested clocks because the GPU
         * is consuming too much power
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventSwPowerCap")
        private Integer clockEventSwPowerCap;

        /**
         * SW Power Scaling algorithm is reducing the clocks below requested clocks because the GPU
         * is consuming too much power
         *
         * @param clockEventSwPowerCap the value to set
         * @return this builder
         */
        public Builder clockEventSwPowerCap(Integer clockEventSwPowerCap) {
            this.clockEventSwPowerCap = clockEventSwPowerCap;
            this.__explicitlySet__.add("clockEventSwPowerCap");
            return this;
        }
        /** GPU clocks are limited by applications clocks setting */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventAppClockSetting")
        private Integer clockEventAppClockSetting;

        /**
         * GPU clocks are limited by applications clocks setting
         *
         * @param clockEventAppClockSetting the value to set
         * @return this builder
         */
        public Builder clockEventAppClockSetting(Integer clockEventAppClockSetting) {
            this.clockEventAppClockSetting = clockEventAppClockSetting;
            this.__explicitlySet__.add("clockEventAppClockSetting");
            return this;
        }
        /**
         * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventHwPowerBreak")
        private Integer clockEventHwPowerBreak;

        /**
         * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
         *
         * @param clockEventHwPowerBreak the value to set
         * @return this builder
         */
        public Builder clockEventHwPowerBreak(Integer clockEventHwPowerBreak) {
            this.clockEventHwPowerBreak = clockEventHwPowerBreak;
            this.__explicitlySet__.add("clockEventHwPowerBreak");
            return this;
        }
        /**
         * SW Thermal capping algorithm is reducing clocks below requested clocks because GPU
         * temperature is higher than Max Operating Temp
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventSwThermalSlowdown")
        private Integer clockEventSwThermalSlowdown;

        /**
         * SW Thermal capping algorithm is reducing clocks below requested clocks because GPU
         * temperature is higher than Max Operating Temp
         *
         * @param clockEventSwThermalSlowdown the value to set
         * @return this builder
         */
        public Builder clockEventSwThermalSlowdown(Integer clockEventSwThermalSlowdown) {
            this.clockEventSwThermalSlowdown = clockEventSwThermalSlowdown;
            this.__explicitlySet__.add("clockEventSwThermalSlowdown");
            return this;
        }
        /**
         * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockEventSyncBoost")
        private Integer clockEventSyncBoost;

        /**
         * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
         *
         * @param clockEventSyncBoost the value to set
         * @return this builder
         */
        public Builder clockEventSyncBoost(Integer clockEventSyncBoost) {
            this.clockEventSyncBoost = clockEventSyncBoost;
            this.__explicitlySet__.add("clockEventSyncBoost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostGpuUsage build() {
            HostGpuUsage model =
                    new HostGpuUsage(
                            this.timeCollected,
                            this.gpuId,
                            this.utilization,
                            this.memoryUtilization,
                            this.powerDraw,
                            this.temperature,
                            this.fanUtilization,
                            this.clockSpeedGraphics,
                            this.clockSpeedSm,
                            this.clockSpeedVideo,
                            this.clockSpeedMemory,
                            this.performanceState,
                            this.eccSingleBitErrors,
                            this.eccDoubleBitErrors,
                            this.clockEventIdle,
                            this.clockEventHwThermalSlowDown,
                            this.clockEventSwPowerCap,
                            this.clockEventAppClockSetting,
                            this.clockEventHwPowerBreak,
                            this.clockEventSwThermalSlowdown,
                            this.clockEventSyncBoost);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostGpuUsage model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("gpuId")) {
                this.gpuId(model.getGpuId());
            }
            if (model.wasPropertyExplicitlySet("utilization")) {
                this.utilization(model.getUtilization());
            }
            if (model.wasPropertyExplicitlySet("memoryUtilization")) {
                this.memoryUtilization(model.getMemoryUtilization());
            }
            if (model.wasPropertyExplicitlySet("powerDraw")) {
                this.powerDraw(model.getPowerDraw());
            }
            if (model.wasPropertyExplicitlySet("temperature")) {
                this.temperature(model.getTemperature());
            }
            if (model.wasPropertyExplicitlySet("fanUtilization")) {
                this.fanUtilization(model.getFanUtilization());
            }
            if (model.wasPropertyExplicitlySet("clockSpeedGraphics")) {
                this.clockSpeedGraphics(model.getClockSpeedGraphics());
            }
            if (model.wasPropertyExplicitlySet("clockSpeedSm")) {
                this.clockSpeedSm(model.getClockSpeedSm());
            }
            if (model.wasPropertyExplicitlySet("clockSpeedVideo")) {
                this.clockSpeedVideo(model.getClockSpeedVideo());
            }
            if (model.wasPropertyExplicitlySet("clockSpeedMemory")) {
                this.clockSpeedMemory(model.getClockSpeedMemory());
            }
            if (model.wasPropertyExplicitlySet("performanceState")) {
                this.performanceState(model.getPerformanceState());
            }
            if (model.wasPropertyExplicitlySet("eccSingleBitErrors")) {
                this.eccSingleBitErrors(model.getEccSingleBitErrors());
            }
            if (model.wasPropertyExplicitlySet("eccDoubleBitErrors")) {
                this.eccDoubleBitErrors(model.getEccDoubleBitErrors());
            }
            if (model.wasPropertyExplicitlySet("clockEventIdle")) {
                this.clockEventIdle(model.getClockEventIdle());
            }
            if (model.wasPropertyExplicitlySet("clockEventHwThermalSlowDown")) {
                this.clockEventHwThermalSlowDown(model.getClockEventHwThermalSlowDown());
            }
            if (model.wasPropertyExplicitlySet("clockEventSwPowerCap")) {
                this.clockEventSwPowerCap(model.getClockEventSwPowerCap());
            }
            if (model.wasPropertyExplicitlySet("clockEventAppClockSetting")) {
                this.clockEventAppClockSetting(model.getClockEventAppClockSetting());
            }
            if (model.wasPropertyExplicitlySet("clockEventHwPowerBreak")) {
                this.clockEventHwPowerBreak(model.getClockEventHwPowerBreak());
            }
            if (model.wasPropertyExplicitlySet("clockEventSwThermalSlowdown")) {
                this.clockEventSwThermalSlowdown(model.getClockEventSwThermalSlowdown());
            }
            if (model.wasPropertyExplicitlySet("clockEventSyncBoost")) {
                this.clockEventSyncBoost(model.getClockEventSyncBoost());
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

    @Deprecated
    public HostGpuUsage(
            java.util.Date timeCollected,
            Integer gpuId,
            Double utilization,
            Double memoryUtilization,
            Double powerDraw,
            Double temperature,
            Double fanUtilization,
            Double clockSpeedGraphics,
            Double clockSpeedSm,
            Double clockSpeedVideo,
            Double clockSpeedMemory,
            Double performanceState,
            Integer eccSingleBitErrors,
            Integer eccDoubleBitErrors,
            Integer clockEventIdle,
            Integer clockEventHwThermalSlowDown,
            Integer clockEventSwPowerCap,
            Integer clockEventAppClockSetting,
            Integer clockEventHwPowerBreak,
            Integer clockEventSwThermalSlowdown,
            Integer clockEventSyncBoost) {
        super(timeCollected);
        this.gpuId = gpuId;
        this.utilization = utilization;
        this.memoryUtilization = memoryUtilization;
        this.powerDraw = powerDraw;
        this.temperature = temperature;
        this.fanUtilization = fanUtilization;
        this.clockSpeedGraphics = clockSpeedGraphics;
        this.clockSpeedSm = clockSpeedSm;
        this.clockSpeedVideo = clockSpeedVideo;
        this.clockSpeedMemory = clockSpeedMemory;
        this.performanceState = performanceState;
        this.eccSingleBitErrors = eccSingleBitErrors;
        this.eccDoubleBitErrors = eccDoubleBitErrors;
        this.clockEventIdle = clockEventIdle;
        this.clockEventHwThermalSlowDown = clockEventHwThermalSlowDown;
        this.clockEventSwPowerCap = clockEventSwPowerCap;
        this.clockEventAppClockSetting = clockEventAppClockSetting;
        this.clockEventHwPowerBreak = clockEventHwPowerBreak;
        this.clockEventSwThermalSlowdown = clockEventSwThermalSlowdown;
        this.clockEventSyncBoost = clockEventSyncBoost;
    }

    /** GPU Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
    private final Integer gpuId;

    /**
     * GPU Identifier
     *
     * @return the value
     */
    public Integer getGpuId() {
        return gpuId;
    }

    /** GPU Utilization Percent */
    @com.fasterxml.jackson.annotation.JsonProperty("utilization")
    private final Double utilization;

    /**
     * GPU Utilization Percent
     *
     * @return the value
     */
    public Double getUtilization() {
        return utilization;
    }

    /** GPU Memory Utilization Percent */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
    private final Double memoryUtilization;

    /**
     * GPU Memory Utilization Percent
     *
     * @return the value
     */
    public Double getMemoryUtilization() {
        return memoryUtilization;
    }

    /** GPU Power Draw in Watts */
    @com.fasterxml.jackson.annotation.JsonProperty("powerDraw")
    private final Double powerDraw;

    /**
     * GPU Power Draw in Watts
     *
     * @return the value
     */
    public Double getPowerDraw() {
        return powerDraw;
    }

    /** GPU Temperature in Celsius */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Double temperature;

    /**
     * GPU Temperature in Celsius
     *
     * @return the value
     */
    public Double getTemperature() {
        return temperature;
    }

    /** GPU Fan Utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("fanUtilization")
    private final Double fanUtilization;

    /**
     * GPU Fan Utilization
     *
     * @return the value
     */
    public Double getFanUtilization() {
        return fanUtilization;
    }

    /** GPU Graphics (Shader) Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedGraphics")
    private final Double clockSpeedGraphics;

    /**
     * GPU Graphics (Shader) Clock Speed
     *
     * @return the value
     */
    public Double getClockSpeedGraphics() {
        return clockSpeedGraphics;
    }

    /** GPU SM (Streaming Multiprocessor) Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedSm")
    private final Double clockSpeedSm;

    /**
     * GPU SM (Streaming Multiprocessor) Clock Speed
     *
     * @return the value
     */
    public Double getClockSpeedSm() {
        return clockSpeedSm;
    }

    /** GPU Video Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedVideo")
    private final Double clockSpeedVideo;

    /**
     * GPU Video Clock Speed
     *
     * @return the value
     */
    public Double getClockSpeedVideo() {
        return clockSpeedVideo;
    }

    /** GPU Memory Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSpeedMemory")
    private final Double clockSpeedMemory;

    /**
     * GPU Memory Clock Speed
     *
     * @return the value
     */
    public Double getClockSpeedMemory() {
        return clockSpeedMemory;
    }

    /** GPU Performance State */
    @com.fasterxml.jackson.annotation.JsonProperty("performanceState")
    private final Double performanceState;

    /**
     * GPU Performance State
     *
     * @return the value
     */
    public Double getPerformanceState() {
        return performanceState;
    }

    /** GPU ECC Single Bit Errors */
    @com.fasterxml.jackson.annotation.JsonProperty("eccSingleBitErrors")
    private final Integer eccSingleBitErrors;

    /**
     * GPU ECC Single Bit Errors
     *
     * @return the value
     */
    public Integer getEccSingleBitErrors() {
        return eccSingleBitErrors;
    }

    /** GPU ECC Double Bit Errors */
    @com.fasterxml.jackson.annotation.JsonProperty("eccDoubleBitErrors")
    private final Integer eccDoubleBitErrors;

    /**
     * GPU ECC Double Bit Errors
     *
     * @return the value
     */
    public Integer getEccDoubleBitErrors() {
        return eccDoubleBitErrors;
    }

    /** Nothing running on CPU, clocks are idle */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventIdle")
    private final Integer clockEventIdle;

    /**
     * Nothing running on CPU, clocks are idle
     *
     * @return the value
     */
    public Integer getClockEventIdle() {
        return clockEventIdle;
    }

    /**
     * HW Thermal Slowdown (reducing the core clocks by a factor of 2 or more) is engaged. Temp too
     * high
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventHwThermalSlowDown")
    private final Integer clockEventHwThermalSlowDown;

    /**
     * HW Thermal Slowdown (reducing the core clocks by a factor of 2 or more) is engaged. Temp too
     * high
     *
     * @return the value
     */
    public Integer getClockEventHwThermalSlowDown() {
        return clockEventHwThermalSlowDown;
    }

    /**
     * SW Power Scaling algorithm is reducing the clocks below requested clocks because the GPU is
     * consuming too much power
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventSwPowerCap")
    private final Integer clockEventSwPowerCap;

    /**
     * SW Power Scaling algorithm is reducing the clocks below requested clocks because the GPU is
     * consuming too much power
     *
     * @return the value
     */
    public Integer getClockEventSwPowerCap() {
        return clockEventSwPowerCap;
    }

    /** GPU clocks are limited by applications clocks setting */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventAppClockSetting")
    private final Integer clockEventAppClockSetting;

    /**
     * GPU clocks are limited by applications clocks setting
     *
     * @return the value
     */
    public Integer getClockEventAppClockSetting() {
        return clockEventAppClockSetting;
    }

    /** HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventHwPowerBreak")
    private final Integer clockEventHwPowerBreak;

    /**
     * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
     *
     * @return the value
     */
    public Integer getClockEventHwPowerBreak() {
        return clockEventHwPowerBreak;
    }

    /**
     * SW Thermal capping algorithm is reducing clocks below requested clocks because GPU
     * temperature is higher than Max Operating Temp
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventSwThermalSlowdown")
    private final Integer clockEventSwThermalSlowdown;

    /**
     * SW Thermal capping algorithm is reducing clocks below requested clocks because GPU
     * temperature is higher than Max Operating Temp
     *
     * @return the value
     */
    public Integer getClockEventSwThermalSlowdown() {
        return clockEventSwThermalSlowdown;
    }

    /** HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged */
    @com.fasterxml.jackson.annotation.JsonProperty("clockEventSyncBoost")
    private final Integer clockEventSyncBoost;

    /**
     * HW Power Brake Slowdown (reducing the core clocks by a factor of 2 or more) is engaged
     *
     * @return the value
     */
    public Integer getClockEventSyncBoost() {
        return clockEventSyncBoost;
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
        sb.append("HostGpuUsage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", gpuId=").append(String.valueOf(this.gpuId));
        sb.append(", utilization=").append(String.valueOf(this.utilization));
        sb.append(", memoryUtilization=").append(String.valueOf(this.memoryUtilization));
        sb.append(", powerDraw=").append(String.valueOf(this.powerDraw));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", fanUtilization=").append(String.valueOf(this.fanUtilization));
        sb.append(", clockSpeedGraphics=").append(String.valueOf(this.clockSpeedGraphics));
        sb.append(", clockSpeedSm=").append(String.valueOf(this.clockSpeedSm));
        sb.append(", clockSpeedVideo=").append(String.valueOf(this.clockSpeedVideo));
        sb.append(", clockSpeedMemory=").append(String.valueOf(this.clockSpeedMemory));
        sb.append(", performanceState=").append(String.valueOf(this.performanceState));
        sb.append(", eccSingleBitErrors=").append(String.valueOf(this.eccSingleBitErrors));
        sb.append(", eccDoubleBitErrors=").append(String.valueOf(this.eccDoubleBitErrors));
        sb.append(", clockEventIdle=").append(String.valueOf(this.clockEventIdle));
        sb.append(", clockEventHwThermalSlowDown=")
                .append(String.valueOf(this.clockEventHwThermalSlowDown));
        sb.append(", clockEventSwPowerCap=").append(String.valueOf(this.clockEventSwPowerCap));
        sb.append(", clockEventAppClockSetting=")
                .append(String.valueOf(this.clockEventAppClockSetting));
        sb.append(", clockEventHwPowerBreak=").append(String.valueOf(this.clockEventHwPowerBreak));
        sb.append(", clockEventSwThermalSlowdown=")
                .append(String.valueOf(this.clockEventSwThermalSlowdown));
        sb.append(", clockEventSyncBoost=").append(String.valueOf(this.clockEventSyncBoost));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostGpuUsage)) {
            return false;
        }

        HostGpuUsage other = (HostGpuUsage) o;
        return java.util.Objects.equals(this.gpuId, other.gpuId)
                && java.util.Objects.equals(this.utilization, other.utilization)
                && java.util.Objects.equals(this.memoryUtilization, other.memoryUtilization)
                && java.util.Objects.equals(this.powerDraw, other.powerDraw)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.fanUtilization, other.fanUtilization)
                && java.util.Objects.equals(this.clockSpeedGraphics, other.clockSpeedGraphics)
                && java.util.Objects.equals(this.clockSpeedSm, other.clockSpeedSm)
                && java.util.Objects.equals(this.clockSpeedVideo, other.clockSpeedVideo)
                && java.util.Objects.equals(this.clockSpeedMemory, other.clockSpeedMemory)
                && java.util.Objects.equals(this.performanceState, other.performanceState)
                && java.util.Objects.equals(this.eccSingleBitErrors, other.eccSingleBitErrors)
                && java.util.Objects.equals(this.eccDoubleBitErrors, other.eccDoubleBitErrors)
                && java.util.Objects.equals(this.clockEventIdle, other.clockEventIdle)
                && java.util.Objects.equals(
                        this.clockEventHwThermalSlowDown, other.clockEventHwThermalSlowDown)
                && java.util.Objects.equals(this.clockEventSwPowerCap, other.clockEventSwPowerCap)
                && java.util.Objects.equals(
                        this.clockEventAppClockSetting, other.clockEventAppClockSetting)
                && java.util.Objects.equals(
                        this.clockEventHwPowerBreak, other.clockEventHwPowerBreak)
                && java.util.Objects.equals(
                        this.clockEventSwThermalSlowdown, other.clockEventSwThermalSlowdown)
                && java.util.Objects.equals(this.clockEventSyncBoost, other.clockEventSyncBoost)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.gpuId == null ? 43 : this.gpuId.hashCode());
        result = (result * PRIME) + (this.utilization == null ? 43 : this.utilization.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryUtilization == null ? 43 : this.memoryUtilization.hashCode());
        result = (result * PRIME) + (this.powerDraw == null ? 43 : this.powerDraw.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result =
                (result * PRIME)
                        + (this.fanUtilization == null ? 43 : this.fanUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.clockSpeedGraphics == null
                                ? 43
                                : this.clockSpeedGraphics.hashCode());
        result = (result * PRIME) + (this.clockSpeedSm == null ? 43 : this.clockSpeedSm.hashCode());
        result =
                (result * PRIME)
                        + (this.clockSpeedVideo == null ? 43 : this.clockSpeedVideo.hashCode());
        result =
                (result * PRIME)
                        + (this.clockSpeedMemory == null ? 43 : this.clockSpeedMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.performanceState == null ? 43 : this.performanceState.hashCode());
        result =
                (result * PRIME)
                        + (this.eccSingleBitErrors == null
                                ? 43
                                : this.eccSingleBitErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.eccDoubleBitErrors == null
                                ? 43
                                : this.eccDoubleBitErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventIdle == null ? 43 : this.clockEventIdle.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventHwThermalSlowDown == null
                                ? 43
                                : this.clockEventHwThermalSlowDown.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventSwPowerCap == null
                                ? 43
                                : this.clockEventSwPowerCap.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventAppClockSetting == null
                                ? 43
                                : this.clockEventAppClockSetting.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventHwPowerBreak == null
                                ? 43
                                : this.clockEventHwPowerBreak.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventSwThermalSlowdown == null
                                ? 43
                                : this.clockEventSwThermalSlowdown.hashCode());
        result =
                (result * PRIME)
                        + (this.clockEventSyncBoost == null
                                ? 43
                                : this.clockEventSyncBoost.hashCode());
        return result;
    }
}
