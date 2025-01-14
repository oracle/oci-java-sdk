/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Details of the request to start JFR recordings. When the targets aren't specified, then all
 * managed instances currently in the Fleet are selected. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestJfrRecordingsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestJfrRecordingsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targets",
        "jfcProfileName",
        "jfcV1",
        "jfcV2",
        "recordingDurationInMinutes",
        "recordingSizeInMb",
        "waitingPeriodInMinutes"
    })
    public RequestJfrRecordingsDetails(
            java.util.List<JfrAttachmentTarget> targets,
            String jfcProfileName,
            String jfcV1,
            String jfcV2,
            Integer recordingDurationInMinutes,
            Integer recordingSizeInMb,
            Integer waitingPeriodInMinutes) {
        super();
        this.targets = targets;
        this.jfcProfileName = jfcProfileName;
        this.jfcV1 = jfcV1;
        this.jfcV2 = jfcV2;
        this.recordingDurationInMinutes = recordingDurationInMinutes;
        this.recordingSizeInMb = recordingSizeInMb;
        this.waitingPeriodInMinutes = waitingPeriodInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The attachment targets to start JFR. */
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<JfrAttachmentTarget> targets;

        /**
         * The attachment targets to start JFR.
         *
         * @param targets the value to set
         * @return this builder
         */
        public Builder targets(java.util.List<JfrAttachmentTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }
        /**
         * The profile used for JFR events selection. If the name isn't recognized, the settings
         * from jfcV1 or jfcV2 will be used depending on the JVM version. Both jfcV2 and jfcV1
         * should be provided to ensure JFR collection on different JVM versions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jfcProfileName")
        private String jfcProfileName;

        /**
         * The profile used for JFR events selection. If the name isn't recognized, the settings
         * from jfcV1 or jfcV2 will be used depending on the JVM version. Both jfcV2 and jfcV1
         * should be provided to ensure JFR collection on different JVM versions.
         *
         * @param jfcProfileName the value to set
         * @return this builder
         */
        public Builder jfcProfileName(String jfcProfileName) {
            this.jfcProfileName = jfcProfileName;
            this.__explicitlySet__.add("jfcProfileName");
            return this;
        }
        /** The BASE64 encoded string of JFR settings XML with schema used by JDK 8. */
        @com.fasterxml.jackson.annotation.JsonProperty("jfcV1")
        private String jfcV1;

        /**
         * The BASE64 encoded string of JFR settings XML with schema used by JDK 8.
         *
         * @param jfcV1 the value to set
         * @return this builder
         */
        public Builder jfcV1(String jfcV1) {
            this.jfcV1 = jfcV1;
            this.__explicitlySet__.add("jfcV1");
            return this;
        }
        /**
         * The BASE64 encoded string of JFR settings XML with [schema used by JDK 9 and
         * after](https://raw.githubusercontent.com/openjdk/jdk/master/src/jdk.jfr/share/classes/jdk/jfr/internal/jfc/jfc.xsd).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jfcV2")
        private String jfcV2;

        /**
         * The BASE64 encoded string of JFR settings XML with [schema used by JDK 9 and
         * after](https://raw.githubusercontent.com/openjdk/jdk/master/src/jdk.jfr/share/classes/jdk/jfr/internal/jfc/jfc.xsd).
         *
         * @param jfcV2 the value to set
         * @return this builder
         */
        public Builder jfcV2(String jfcV2) {
            this.jfcV2 = jfcV2;
            this.__explicitlySet__.add("jfcV2");
            return this;
        }
        /** Duration of the JFR recording in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("recordingDurationInMinutes")
        private Integer recordingDurationInMinutes;

        /**
         * Duration of the JFR recording in minutes.
         *
         * @param recordingDurationInMinutes the value to set
         * @return this builder
         */
        public Builder recordingDurationInMinutes(Integer recordingDurationInMinutes) {
            this.recordingDurationInMinutes = recordingDurationInMinutes;
            this.__explicitlySet__.add("recordingDurationInMinutes");
            return this;
        }
        /** The maximum size limit for the JFR file collected. */
        @com.fasterxml.jackson.annotation.JsonProperty("recordingSizeInMb")
        private Integer recordingSizeInMb;

        /**
         * The maximum size limit for the JFR file collected.
         *
         * @param recordingSizeInMb the value to set
         * @return this builder
         */
        public Builder recordingSizeInMb(Integer recordingSizeInMb) {
            this.recordingSizeInMb = recordingSizeInMb;
            this.__explicitlySet__.add("recordingSizeInMb");
            return this;
        }
        /**
         * Period to looking for JVMs. In addition to attach to running JVMs when given the command,
         * JVM started within the waiting period will also be attached for JFR. The value should be
         * larger than the agent polling interval setting for the fleet to ensure agent can get the
         * instructions. If not specified, the agent polling interval for the fleet is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("waitingPeriodInMinutes")
        private Integer waitingPeriodInMinutes;

        /**
         * Period to looking for JVMs. In addition to attach to running JVMs when given the command,
         * JVM started within the waiting period will also be attached for JFR. The value should be
         * larger than the agent polling interval setting for the fleet to ensure agent can get the
         * instructions. If not specified, the agent polling interval for the fleet is used.
         *
         * @param waitingPeriodInMinutes the value to set
         * @return this builder
         */
        public Builder waitingPeriodInMinutes(Integer waitingPeriodInMinutes) {
            this.waitingPeriodInMinutes = waitingPeriodInMinutes;
            this.__explicitlySet__.add("waitingPeriodInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestJfrRecordingsDetails build() {
            RequestJfrRecordingsDetails model =
                    new RequestJfrRecordingsDetails(
                            this.targets,
                            this.jfcProfileName,
                            this.jfcV1,
                            this.jfcV2,
                            this.recordingDurationInMinutes,
                            this.recordingSizeInMb,
                            this.waitingPeriodInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestJfrRecordingsDetails model) {
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
            }
            if (model.wasPropertyExplicitlySet("jfcProfileName")) {
                this.jfcProfileName(model.getJfcProfileName());
            }
            if (model.wasPropertyExplicitlySet("jfcV1")) {
                this.jfcV1(model.getJfcV1());
            }
            if (model.wasPropertyExplicitlySet("jfcV2")) {
                this.jfcV2(model.getJfcV2());
            }
            if (model.wasPropertyExplicitlySet("recordingDurationInMinutes")) {
                this.recordingDurationInMinutes(model.getRecordingDurationInMinutes());
            }
            if (model.wasPropertyExplicitlySet("recordingSizeInMb")) {
                this.recordingSizeInMb(model.getRecordingSizeInMb());
            }
            if (model.wasPropertyExplicitlySet("waitingPeriodInMinutes")) {
                this.waitingPeriodInMinutes(model.getWaitingPeriodInMinutes());
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

    /** The attachment targets to start JFR. */
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<JfrAttachmentTarget> targets;

    /**
     * The attachment targets to start JFR.
     *
     * @return the value
     */
    public java.util.List<JfrAttachmentTarget> getTargets() {
        return targets;
    }

    /**
     * The profile used for JFR events selection. If the name isn't recognized, the settings from
     * jfcV1 or jfcV2 will be used depending on the JVM version. Both jfcV2 and jfcV1 should be
     * provided to ensure JFR collection on different JVM versions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jfcProfileName")
    private final String jfcProfileName;

    /**
     * The profile used for JFR events selection. If the name isn't recognized, the settings from
     * jfcV1 or jfcV2 will be used depending on the JVM version. Both jfcV2 and jfcV1 should be
     * provided to ensure JFR collection on different JVM versions.
     *
     * @return the value
     */
    public String getJfcProfileName() {
        return jfcProfileName;
    }

    /** The BASE64 encoded string of JFR settings XML with schema used by JDK 8. */
    @com.fasterxml.jackson.annotation.JsonProperty("jfcV1")
    private final String jfcV1;

    /**
     * The BASE64 encoded string of JFR settings XML with schema used by JDK 8.
     *
     * @return the value
     */
    public String getJfcV1() {
        return jfcV1;
    }

    /**
     * The BASE64 encoded string of JFR settings XML with [schema used by JDK 9 and
     * after](https://raw.githubusercontent.com/openjdk/jdk/master/src/jdk.jfr/share/classes/jdk/jfr/internal/jfc/jfc.xsd).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jfcV2")
    private final String jfcV2;

    /**
     * The BASE64 encoded string of JFR settings XML with [schema used by JDK 9 and
     * after](https://raw.githubusercontent.com/openjdk/jdk/master/src/jdk.jfr/share/classes/jdk/jfr/internal/jfc/jfc.xsd).
     *
     * @return the value
     */
    public String getJfcV2() {
        return jfcV2;
    }

    /** Duration of the JFR recording in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("recordingDurationInMinutes")
    private final Integer recordingDurationInMinutes;

    /**
     * Duration of the JFR recording in minutes.
     *
     * @return the value
     */
    public Integer getRecordingDurationInMinutes() {
        return recordingDurationInMinutes;
    }

    /** The maximum size limit for the JFR file collected. */
    @com.fasterxml.jackson.annotation.JsonProperty("recordingSizeInMb")
    private final Integer recordingSizeInMb;

    /**
     * The maximum size limit for the JFR file collected.
     *
     * @return the value
     */
    public Integer getRecordingSizeInMb() {
        return recordingSizeInMb;
    }

    /**
     * Period to looking for JVMs. In addition to attach to running JVMs when given the command, JVM
     * started within the waiting period will also be attached for JFR. The value should be larger
     * than the agent polling interval setting for the fleet to ensure agent can get the
     * instructions. If not specified, the agent polling interval for the fleet is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("waitingPeriodInMinutes")
    private final Integer waitingPeriodInMinutes;

    /**
     * Period to looking for JVMs. In addition to attach to running JVMs when given the command, JVM
     * started within the waiting period will also be attached for JFR. The value should be larger
     * than the agent polling interval setting for the fleet to ensure agent can get the
     * instructions. If not specified, the agent polling interval for the fleet is used.
     *
     * @return the value
     */
    public Integer getWaitingPeriodInMinutes() {
        return waitingPeriodInMinutes;
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
        sb.append("RequestJfrRecordingsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targets=").append(String.valueOf(this.targets));
        sb.append(", jfcProfileName=").append(String.valueOf(this.jfcProfileName));
        sb.append(", jfcV1=").append(String.valueOf(this.jfcV1));
        sb.append(", jfcV2=").append(String.valueOf(this.jfcV2));
        sb.append(", recordingDurationInMinutes=")
                .append(String.valueOf(this.recordingDurationInMinutes));
        sb.append(", recordingSizeInMb=").append(String.valueOf(this.recordingSizeInMb));
        sb.append(", waitingPeriodInMinutes=").append(String.valueOf(this.waitingPeriodInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestJfrRecordingsDetails)) {
            return false;
        }

        RequestJfrRecordingsDetails other = (RequestJfrRecordingsDetails) o;
        return java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.jfcProfileName, other.jfcProfileName)
                && java.util.Objects.equals(this.jfcV1, other.jfcV1)
                && java.util.Objects.equals(this.jfcV2, other.jfcV2)
                && java.util.Objects.equals(
                        this.recordingDurationInMinutes, other.recordingDurationInMinutes)
                && java.util.Objects.equals(this.recordingSizeInMb, other.recordingSizeInMb)
                && java.util.Objects.equals(
                        this.waitingPeriodInMinutes, other.waitingPeriodInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result =
                (result * PRIME)
                        + (this.jfcProfileName == null ? 43 : this.jfcProfileName.hashCode());
        result = (result * PRIME) + (this.jfcV1 == null ? 43 : this.jfcV1.hashCode());
        result = (result * PRIME) + (this.jfcV2 == null ? 43 : this.jfcV2.hashCode());
        result =
                (result * PRIME)
                        + (this.recordingDurationInMinutes == null
                                ? 43
                                : this.recordingDurationInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.recordingSizeInMb == null ? 43 : this.recordingSizeInMb.hashCode());
        result =
                (result * PRIME)
                        + (this.waitingPeriodInMinutes == null
                                ? 43
                                : this.waitingPeriodInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
