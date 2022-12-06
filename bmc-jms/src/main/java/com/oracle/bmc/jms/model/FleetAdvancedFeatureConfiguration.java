/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Advanced feature metadata for the fleet
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetAdvancedFeatureConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetAdvancedFeatureConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "analyticNamespace",
        "analyticBucketName",
        "lcm",
        "cryptoEventAnalysis",
        "advancedUsageTracking",
        "jfrRecording",
        "timeLastModified"
    })
    public FleetAdvancedFeatureConfiguration(
            String analyticNamespace,
            String analyticBucketName,
            Lcm lcm,
            CryptoEventAnalysis cryptoEventAnalysis,
            AdvancedUsageTracking advancedUsageTracking,
            JfrRecording jfrRecording,
            java.util.Date timeLastModified) {
        super();
        this.analyticNamespace = analyticNamespace;
        this.analyticBucketName = analyticBucketName;
        this.lcm = lcm;
        this.cryptoEventAnalysis = cryptoEventAnalysis;
        this.advancedUsageTracking = advancedUsageTracking;
        this.jfrRecording = jfrRecording;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Namespace for the fleet advanced feature
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("analyticNamespace")
        private String analyticNamespace;

        /**
         * Namespace for the fleet advanced feature
         * @param analyticNamespace the value to set
         * @return this builder
         **/
        public Builder analyticNamespace(String analyticNamespace) {
            this.analyticNamespace = analyticNamespace;
            this.__explicitlySet__.add("analyticNamespace");
            return this;
        }
        /**
         * Bucket name required to store jfr and related data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("analyticBucketName")
        private String analyticBucketName;

        /**
         * Bucket name required to store jfr and related data
         * @param analyticBucketName the value to set
         * @return this builder
         **/
        public Builder analyticBucketName(String analyticBucketName) {
            this.analyticBucketName = analyticBucketName;
            this.__explicitlySet__.add("analyticBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lcm")
        private Lcm lcm;

        public Builder lcm(Lcm lcm) {
            this.lcm = lcm;
            this.__explicitlySet__.add("lcm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cryptoEventAnalysis")
        private CryptoEventAnalysis cryptoEventAnalysis;

        public Builder cryptoEventAnalysis(CryptoEventAnalysis cryptoEventAnalysis) {
            this.cryptoEventAnalysis = cryptoEventAnalysis;
            this.__explicitlySet__.add("cryptoEventAnalysis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advancedUsageTracking")
        private AdvancedUsageTracking advancedUsageTracking;

        public Builder advancedUsageTracking(AdvancedUsageTracking advancedUsageTracking) {
            this.advancedUsageTracking = advancedUsageTracking;
            this.__explicitlySet__.add("advancedUsageTracking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jfrRecording")
        private JfrRecording jfrRecording;

        public Builder jfrRecording(JfrRecording jfrRecording) {
            this.jfrRecording = jfrRecording;
            this.__explicitlySet__.add("jfrRecording");
            return this;
        }
        /**
         * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastModified the value to set
         * @return this builder
         **/
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetAdvancedFeatureConfiguration build() {
            FleetAdvancedFeatureConfiguration model =
                    new FleetAdvancedFeatureConfiguration(
                            this.analyticNamespace,
                            this.analyticBucketName,
                            this.lcm,
                            this.cryptoEventAnalysis,
                            this.advancedUsageTracking,
                            this.jfrRecording,
                            this.timeLastModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetAdvancedFeatureConfiguration model) {
            if (model.wasPropertyExplicitlySet("analyticNamespace")) {
                this.analyticNamespace(model.getAnalyticNamespace());
            }
            if (model.wasPropertyExplicitlySet("analyticBucketName")) {
                this.analyticBucketName(model.getAnalyticBucketName());
            }
            if (model.wasPropertyExplicitlySet("lcm")) {
                this.lcm(model.getLcm());
            }
            if (model.wasPropertyExplicitlySet("cryptoEventAnalysis")) {
                this.cryptoEventAnalysis(model.getCryptoEventAnalysis());
            }
            if (model.wasPropertyExplicitlySet("advancedUsageTracking")) {
                this.advancedUsageTracking(model.getAdvancedUsageTracking());
            }
            if (model.wasPropertyExplicitlySet("jfrRecording")) {
                this.jfrRecording(model.getJfrRecording());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
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
     * Namespace for the fleet advanced feature
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("analyticNamespace")
    private final String analyticNamespace;

    /**
     * Namespace for the fleet advanced feature
     * @return the value
     **/
    public String getAnalyticNamespace() {
        return analyticNamespace;
    }

    /**
     * Bucket name required to store jfr and related data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("analyticBucketName")
    private final String analyticBucketName;

    /**
     * Bucket name required to store jfr and related data
     * @return the value
     **/
    public String getAnalyticBucketName() {
        return analyticBucketName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lcm")
    private final Lcm lcm;

    public Lcm getLcm() {
        return lcm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cryptoEventAnalysis")
    private final CryptoEventAnalysis cryptoEventAnalysis;

    public CryptoEventAnalysis getCryptoEventAnalysis() {
        return cryptoEventAnalysis;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advancedUsageTracking")
    private final AdvancedUsageTracking advancedUsageTracking;

    public AdvancedUsageTracking getAdvancedUsageTracking() {
        return advancedUsageTracking;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jfrRecording")
    private final JfrRecording jfrRecording;

    public JfrRecording getJfrRecording() {
        return jfrRecording;
    }

    /**
     * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     **/
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
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
        sb.append("FleetAdvancedFeatureConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("analyticNamespace=").append(String.valueOf(this.analyticNamespace));
        sb.append(", analyticBucketName=").append(String.valueOf(this.analyticBucketName));
        sb.append(", lcm=").append(String.valueOf(this.lcm));
        sb.append(", cryptoEventAnalysis=").append(String.valueOf(this.cryptoEventAnalysis));
        sb.append(", advancedUsageTracking=").append(String.valueOf(this.advancedUsageTracking));
        sb.append(", jfrRecording=").append(String.valueOf(this.jfrRecording));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetAdvancedFeatureConfiguration)) {
            return false;
        }

        FleetAdvancedFeatureConfiguration other = (FleetAdvancedFeatureConfiguration) o;
        return java.util.Objects.equals(this.analyticNamespace, other.analyticNamespace)
                && java.util.Objects.equals(this.analyticBucketName, other.analyticBucketName)
                && java.util.Objects.equals(this.lcm, other.lcm)
                && java.util.Objects.equals(this.cryptoEventAnalysis, other.cryptoEventAnalysis)
                && java.util.Objects.equals(this.advancedUsageTracking, other.advancedUsageTracking)
                && java.util.Objects.equals(this.jfrRecording, other.jfrRecording)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.analyticNamespace == null ? 43 : this.analyticNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticBucketName == null
                                ? 43
                                : this.analyticBucketName.hashCode());
        result = (result * PRIME) + (this.lcm == null ? 43 : this.lcm.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoEventAnalysis == null
                                ? 43
                                : this.cryptoEventAnalysis.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedUsageTracking == null
                                ? 43
                                : this.advancedUsageTracking.hashCode());
        result = (result * PRIME) + (this.jfrRecording == null ? 43 : this.jfrRecording.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
