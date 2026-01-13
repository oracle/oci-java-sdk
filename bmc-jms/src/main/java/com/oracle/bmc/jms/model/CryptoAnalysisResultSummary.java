/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summary of a crypto analysis result. The actual output of the analysis is stored in the Object
 * Storage object. <br>
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
        builder = CryptoAnalysisResultSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAnalysisResultSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "aggregationMode",
        "fleetId",
        "managedInstanceId",
        "hostName",
        "timeFirstEvent",
        "timeLastEvent",
        "totalEventCount",
        "summarizedEventCount",
        "findingCount",
        "nonCompliantFindingCount",
        "timeCreated",
        "timeStarted",
        "timeFinished",
        "cryptoRoadmapVersion",
        "namespace",
        "bucketName",
        "objectName"
    })
    public CryptoAnalysisResultSummary(
            String id,
            String workRequestId,
            CryptoAnalysisResultMode aggregationMode,
            String fleetId,
            String managedInstanceId,
            String hostName,
            java.util.Date timeFirstEvent,
            java.util.Date timeLastEvent,
            Integer totalEventCount,
            Integer summarizedEventCount,
            Integer findingCount,
            Integer nonCompliantFindingCount,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String cryptoRoadmapVersion,
            String namespace,
            String bucketName,
            String objectName) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.aggregationMode = aggregationMode;
        this.fleetId = fleetId;
        this.managedInstanceId = managedInstanceId;
        this.hostName = hostName;
        this.timeFirstEvent = timeFirstEvent;
        this.timeLastEvent = timeLastEvent;
        this.totalEventCount = totalEventCount;
        this.summarizedEventCount = summarizedEventCount;
        this.findingCount = findingCount;
        this.nonCompliantFindingCount = nonCompliantFindingCount;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.cryptoRoadmapVersion = cryptoRoadmapVersion;
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectName = objectName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID to identify this analysis results. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID to identify this analysis results.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the work request to start the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the work request to start the analysis.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /** The result aggregation mode */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationMode")
        private CryptoAnalysisResultMode aggregationMode;

        /**
         * The result aggregation mode
         *
         * @param aggregationMode the value to set
         * @return this builder
         */
        public Builder aggregationMode(CryptoAnalysisResultMode aggregationMode) {
            this.aggregationMode = aggregationMode;
            this.__explicitlySet__.add("aggregationMode");
            return this;
        }
        /** The fleet OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The fleet OCID.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The managed instance OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The managed instance OCID.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /** The hostname of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The hostname of the managed instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Time of the first event in the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstEvent")
        private java.util.Date timeFirstEvent;

        /**
         * Time of the first event in the analysis.
         *
         * @param timeFirstEvent the value to set
         * @return this builder
         */
        public Builder timeFirstEvent(java.util.Date timeFirstEvent) {
            this.timeFirstEvent = timeFirstEvent;
            this.__explicitlySet__.add("timeFirstEvent");
            return this;
        }
        /** Time of the last event in the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastEvent")
        private java.util.Date timeLastEvent;

        /**
         * Time of the last event in the analysis.
         *
         * @param timeLastEvent the value to set
         * @return this builder
         */
        public Builder timeLastEvent(java.util.Date timeLastEvent) {
            this.timeLastEvent = timeLastEvent;
            this.__explicitlySet__.add("timeLastEvent");
            return this;
        }
        /** Total number of events in the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalEventCount")
        private Integer totalEventCount;

        /**
         * Total number of events in the analysis.
         *
         * @param totalEventCount the value to set
         * @return this builder
         */
        public Builder totalEventCount(Integer totalEventCount) {
            this.totalEventCount = totalEventCount;
            this.__explicitlySet__.add("totalEventCount");
            return this;
        }
        /**
         * Total number of summarized events. Summarized events are deduplicated events of interest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("summarizedEventCount")
        private Integer summarizedEventCount;

        /**
         * Total number of summarized events. Summarized events are deduplicated events of interest.
         *
         * @param summarizedEventCount the value to set
         * @return this builder
         */
        public Builder summarizedEventCount(Integer summarizedEventCount) {
            this.summarizedEventCount = summarizedEventCount;
            this.__explicitlySet__.add("summarizedEventCount");
            return this;
        }
        /** Total number of findings with the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
        private Integer findingCount;

        /**
         * Total number of findings with the analysis.
         *
         * @param findingCount the value to set
         * @return this builder
         */
        public Builder findingCount(Integer findingCount) {
            this.findingCount = findingCount;
            this.__explicitlySet__.add("findingCount");
            return this;
        }
        /**
         * Total number of non-compliant findings with the analysis. A non-compliant finding means
         * the application won't work properly with the changes introduced by the Crypto Roadmap
         * version used by the analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantFindingCount")
        private Integer nonCompliantFindingCount;

        /**
         * Total number of non-compliant findings with the analysis. A non-compliant finding means
         * the application won't work properly with the changes introduced by the Crypto Roadmap
         * version used by the analysis.
         *
         * @param nonCompliantFindingCount the value to set
         * @return this builder
         */
        public Builder nonCompliantFindingCount(Integer nonCompliantFindingCount) {
            this.nonCompliantFindingCount = nonCompliantFindingCount;
            this.__explicitlySet__.add("nonCompliantFindingCount");
            return this;
        }
        /** The time the result is compiled. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the result is compiled.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the JFR recording has started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the JFR recording has started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time the JFR recording has finished. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the JFR recording has finished.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** The Crypto Roadmap version used to perform the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("cryptoRoadmapVersion")
        private String cryptoRoadmapVersion;

        /**
         * The Crypto Roadmap version used to perform the analysis.
         *
         * @param cryptoRoadmapVersion the value to set
         * @return this builder
         */
        public Builder cryptoRoadmapVersion(String cryptoRoadmapVersion) {
            this.cryptoRoadmapVersion = cryptoRoadmapVersion;
            this.__explicitlySet__.add("cryptoRoadmapVersion");
            return this;
        }
        /** The Object Storage namespace of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace of this analysis result.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The Object Storage bucket name of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket name of this analysis result.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The Object Storage object name of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The Object Storage object name of this analysis result.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAnalysisResultSummary build() {
            CryptoAnalysisResultSummary model =
                    new CryptoAnalysisResultSummary(
                            this.id,
                            this.workRequestId,
                            this.aggregationMode,
                            this.fleetId,
                            this.managedInstanceId,
                            this.hostName,
                            this.timeFirstEvent,
                            this.timeLastEvent,
                            this.totalEventCount,
                            this.summarizedEventCount,
                            this.findingCount,
                            this.nonCompliantFindingCount,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished,
                            this.cryptoRoadmapVersion,
                            this.namespace,
                            this.bucketName,
                            this.objectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAnalysisResultSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("aggregationMode")) {
                this.aggregationMode(model.getAggregationMode());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("timeFirstEvent")) {
                this.timeFirstEvent(model.getTimeFirstEvent());
            }
            if (model.wasPropertyExplicitlySet("timeLastEvent")) {
                this.timeLastEvent(model.getTimeLastEvent());
            }
            if (model.wasPropertyExplicitlySet("totalEventCount")) {
                this.totalEventCount(model.getTotalEventCount());
            }
            if (model.wasPropertyExplicitlySet("summarizedEventCount")) {
                this.summarizedEventCount(model.getSummarizedEventCount());
            }
            if (model.wasPropertyExplicitlySet("findingCount")) {
                this.findingCount(model.getFindingCount());
            }
            if (model.wasPropertyExplicitlySet("nonCompliantFindingCount")) {
                this.nonCompliantFindingCount(model.getNonCompliantFindingCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("cryptoRoadmapVersion")) {
                this.cryptoRoadmapVersion(model.getCryptoRoadmapVersion());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
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

    /** The OCID to identify this analysis results. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID to identify this analysis results.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the work request to start the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the work request to start the analysis.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /** The result aggregation mode */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationMode")
    private final CryptoAnalysisResultMode aggregationMode;

    /**
     * The result aggregation mode
     *
     * @return the value
     */
    public CryptoAnalysisResultMode getAggregationMode() {
        return aggregationMode;
    }

    /** The fleet OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The fleet OCID.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The managed instance OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The managed instance OCID.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /** The hostname of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The hostname of the managed instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Time of the first event in the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstEvent")
    private final java.util.Date timeFirstEvent;

    /**
     * Time of the first event in the analysis.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstEvent() {
        return timeFirstEvent;
    }

    /** Time of the last event in the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastEvent")
    private final java.util.Date timeLastEvent;

    /**
     * Time of the last event in the analysis.
     *
     * @return the value
     */
    public java.util.Date getTimeLastEvent() {
        return timeLastEvent;
    }

    /** Total number of events in the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalEventCount")
    private final Integer totalEventCount;

    /**
     * Total number of events in the analysis.
     *
     * @return the value
     */
    public Integer getTotalEventCount() {
        return totalEventCount;
    }

    /** Total number of summarized events. Summarized events are deduplicated events of interest. */
    @com.fasterxml.jackson.annotation.JsonProperty("summarizedEventCount")
    private final Integer summarizedEventCount;

    /**
     * Total number of summarized events. Summarized events are deduplicated events of interest.
     *
     * @return the value
     */
    public Integer getSummarizedEventCount() {
        return summarizedEventCount;
    }

    /** Total number of findings with the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
    private final Integer findingCount;

    /**
     * Total number of findings with the analysis.
     *
     * @return the value
     */
    public Integer getFindingCount() {
        return findingCount;
    }

    /**
     * Total number of non-compliant findings with the analysis. A non-compliant finding means the
     * application won't work properly with the changes introduced by the Crypto Roadmap version
     * used by the analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantFindingCount")
    private final Integer nonCompliantFindingCount;

    /**
     * Total number of non-compliant findings with the analysis. A non-compliant finding means the
     * application won't work properly with the changes introduced by the Crypto Roadmap version
     * used by the analysis.
     *
     * @return the value
     */
    public Integer getNonCompliantFindingCount() {
        return nonCompliantFindingCount;
    }

    /** The time the result is compiled. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the result is compiled.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the JFR recording has started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the JFR recording has started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the JFR recording has finished. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the JFR recording has finished.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The Crypto Roadmap version used to perform the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("cryptoRoadmapVersion")
    private final String cryptoRoadmapVersion;

    /**
     * The Crypto Roadmap version used to perform the analysis.
     *
     * @return the value
     */
    public String getCryptoRoadmapVersion() {
        return cryptoRoadmapVersion;
    }

    /** The Object Storage namespace of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace of this analysis result.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The Object Storage bucket name of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket name of this analysis result.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The Object Storage object name of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The Object Storage object name of this analysis result.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
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
        sb.append("CryptoAnalysisResultSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", aggregationMode=").append(String.valueOf(this.aggregationMode));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", timeFirstEvent=").append(String.valueOf(this.timeFirstEvent));
        sb.append(", timeLastEvent=").append(String.valueOf(this.timeLastEvent));
        sb.append(", totalEventCount=").append(String.valueOf(this.totalEventCount));
        sb.append(", summarizedEventCount=").append(String.valueOf(this.summarizedEventCount));
        sb.append(", findingCount=").append(String.valueOf(this.findingCount));
        sb.append(", nonCompliantFindingCount=")
                .append(String.valueOf(this.nonCompliantFindingCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", cryptoRoadmapVersion=").append(String.valueOf(this.cryptoRoadmapVersion));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAnalysisResultSummary)) {
            return false;
        }

        CryptoAnalysisResultSummary other = (CryptoAnalysisResultSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.aggregationMode, other.aggregationMode)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.timeFirstEvent, other.timeFirstEvent)
                && java.util.Objects.equals(this.timeLastEvent, other.timeLastEvent)
                && java.util.Objects.equals(this.totalEventCount, other.totalEventCount)
                && java.util.Objects.equals(this.summarizedEventCount, other.summarizedEventCount)
                && java.util.Objects.equals(this.findingCount, other.findingCount)
                && java.util.Objects.equals(
                        this.nonCompliantFindingCount, other.nonCompliantFindingCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.cryptoRoadmapVersion, other.cryptoRoadmapVersion)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationMode == null ? 43 : this.aggregationMode.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstEvent == null ? 43 : this.timeFirstEvent.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastEvent == null ? 43 : this.timeLastEvent.hashCode());
        result =
                (result * PRIME)
                        + (this.totalEventCount == null ? 43 : this.totalEventCount.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizedEventCount == null
                                ? 43
                                : this.summarizedEventCount.hashCode());
        result = (result * PRIME) + (this.findingCount == null ? 43 : this.findingCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCompliantFindingCount == null
                                ? 43
                                : this.nonCompliantFindingCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoRoadmapVersion == null
                                ? 43
                                : this.cryptoRoadmapVersion.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
