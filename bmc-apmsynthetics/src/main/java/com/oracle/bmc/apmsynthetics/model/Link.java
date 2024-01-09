/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the link between two nodes. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Link.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Link extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "source",
        "destination",
        "repeatCount",
        "forwardingLoss",
        "delayInMilliseconds",
        "minDelayInMilliseconds",
        "maxDelayInMilliseconds",
        "paths"
    })
    public Link(
            String id,
            String source,
            String destination,
            Integer repeatCount,
            Double forwardingLoss,
            Double delayInMilliseconds,
            Double minDelayInMilliseconds,
            Double maxDelayInMilliseconds,
            java.util.List<String> paths) {
        super();
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.repeatCount = repeatCount;
        this.forwardingLoss = forwardingLoss;
        this.delayInMilliseconds = delayInMilliseconds;
        this.minDelayInMilliseconds = minDelayInMilliseconds;
        this.maxDelayInMilliseconds = maxDelayInMilliseconds;
        this.paths = paths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID of the link. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * ID of the link.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** ID of the source node. */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * ID of the source node.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** ID of the destination node. */
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * ID of the destination node.
         *
         * @param destination the value to set
         * @return this builder
         */
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /** Number of times the link is repeated. */
        @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
        private Integer repeatCount;

        /**
         * Number of times the link is repeated.
         *
         * @param repeatCount the value to set
         * @return this builder
         */
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            this.__explicitlySet__.add("repeatCount");
            return this;
        }
        /** Average packet loss. */
        @com.fasterxml.jackson.annotation.JsonProperty("forwardingLoss")
        private Double forwardingLoss;

        /**
         * Average packet loss.
         *
         * @param forwardingLoss the value to set
         * @return this builder
         */
        public Builder forwardingLoss(Double forwardingLoss) {
            this.forwardingLoss = forwardingLoss;
            this.__explicitlySet__.add("forwardingLoss");
            return this;
        }
        /**
         * Difference of the packet response time between source and destination nodes, in
         * milliseconds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("delayInMilliseconds")
        private Double delayInMilliseconds;

        /**
         * Difference of the packet response time between source and destination nodes, in
         * milliseconds.
         *
         * @param delayInMilliseconds the value to set
         * @return this builder
         */
        public Builder delayInMilliseconds(Double delayInMilliseconds) {
            this.delayInMilliseconds = delayInMilliseconds;
            this.__explicitlySet__.add("delayInMilliseconds");
            return this;
        }
        /** Minimum delay in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("minDelayInMilliseconds")
        private Double minDelayInMilliseconds;

        /**
         * Minimum delay in milliseconds.
         *
         * @param minDelayInMilliseconds the value to set
         * @return this builder
         */
        public Builder minDelayInMilliseconds(Double minDelayInMilliseconds) {
            this.minDelayInMilliseconds = minDelayInMilliseconds;
            this.__explicitlySet__.add("minDelayInMilliseconds");
            return this;
        }
        /** Maximum delay in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDelayInMilliseconds")
        private Double maxDelayInMilliseconds;

        /**
         * Maximum delay in milliseconds.
         *
         * @param maxDelayInMilliseconds the value to set
         * @return this builder
         */
        public Builder maxDelayInMilliseconds(Double maxDelayInMilliseconds) {
            this.maxDelayInMilliseconds = maxDelayInMilliseconds;
            this.__explicitlySet__.add("maxDelayInMilliseconds");
            return this;
        }
        /** List of all path IDs of which this link is part of. */
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private java.util.List<String> paths;

        /**
         * List of all path IDs of which this link is part of.
         *
         * @param paths the value to set
         * @return this builder
         */
        public Builder paths(java.util.List<String> paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Link build() {
            Link model =
                    new Link(
                            this.id,
                            this.source,
                            this.destination,
                            this.repeatCount,
                            this.forwardingLoss,
                            this.delayInMilliseconds,
                            this.minDelayInMilliseconds,
                            this.maxDelayInMilliseconds,
                            this.paths);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Link model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("repeatCount")) {
                this.repeatCount(model.getRepeatCount());
            }
            if (model.wasPropertyExplicitlySet("forwardingLoss")) {
                this.forwardingLoss(model.getForwardingLoss());
            }
            if (model.wasPropertyExplicitlySet("delayInMilliseconds")) {
                this.delayInMilliseconds(model.getDelayInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("minDelayInMilliseconds")) {
                this.minDelayInMilliseconds(model.getMinDelayInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("maxDelayInMilliseconds")) {
                this.maxDelayInMilliseconds(model.getMaxDelayInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("paths")) {
                this.paths(model.getPaths());
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

    /** ID of the link. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * ID of the link.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** ID of the source node. */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * ID of the source node.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /** ID of the destination node. */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * ID of the destination node.
     *
     * @return the value
     */
    public String getDestination() {
        return destination;
    }

    /** Number of times the link is repeated. */
    @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
    private final Integer repeatCount;

    /**
     * Number of times the link is repeated.
     *
     * @return the value
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    /** Average packet loss. */
    @com.fasterxml.jackson.annotation.JsonProperty("forwardingLoss")
    private final Double forwardingLoss;

    /**
     * Average packet loss.
     *
     * @return the value
     */
    public Double getForwardingLoss() {
        return forwardingLoss;
    }

    /**
     * Difference of the packet response time between source and destination nodes, in milliseconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delayInMilliseconds")
    private final Double delayInMilliseconds;

    /**
     * Difference of the packet response time between source and destination nodes, in milliseconds.
     *
     * @return the value
     */
    public Double getDelayInMilliseconds() {
        return delayInMilliseconds;
    }

    /** Minimum delay in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("minDelayInMilliseconds")
    private final Double minDelayInMilliseconds;

    /**
     * Minimum delay in milliseconds.
     *
     * @return the value
     */
    public Double getMinDelayInMilliseconds() {
        return minDelayInMilliseconds;
    }

    /** Maximum delay in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDelayInMilliseconds")
    private final Double maxDelayInMilliseconds;

    /**
     * Maximum delay in milliseconds.
     *
     * @return the value
     */
    public Double getMaxDelayInMilliseconds() {
        return maxDelayInMilliseconds;
    }

    /** List of all path IDs of which this link is part of. */
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final java.util.List<String> paths;

    /**
     * List of all path IDs of which this link is part of.
     *
     * @return the value
     */
    public java.util.List<String> getPaths() {
        return paths;
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
        sb.append("Link(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", repeatCount=").append(String.valueOf(this.repeatCount));
        sb.append(", forwardingLoss=").append(String.valueOf(this.forwardingLoss));
        sb.append(", delayInMilliseconds=").append(String.valueOf(this.delayInMilliseconds));
        sb.append(", minDelayInMilliseconds=").append(String.valueOf(this.minDelayInMilliseconds));
        sb.append(", maxDelayInMilliseconds=").append(String.valueOf(this.maxDelayInMilliseconds));
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Link)) {
            return false;
        }

        Link other = (Link) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.repeatCount, other.repeatCount)
                && java.util.Objects.equals(this.forwardingLoss, other.forwardingLoss)
                && java.util.Objects.equals(this.delayInMilliseconds, other.delayInMilliseconds)
                && java.util.Objects.equals(
                        this.minDelayInMilliseconds, other.minDelayInMilliseconds)
                && java.util.Objects.equals(
                        this.maxDelayInMilliseconds, other.maxDelayInMilliseconds)
                && java.util.Objects.equals(this.paths, other.paths)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result = (result * PRIME) + (this.repeatCount == null ? 43 : this.repeatCount.hashCode());
        result =
                (result * PRIME)
                        + (this.forwardingLoss == null ? 43 : this.forwardingLoss.hashCode());
        result =
                (result * PRIME)
                        + (this.delayInMilliseconds == null
                                ? 43
                                : this.delayInMilliseconds.hashCode());
        result =
                (result * PRIME)
                        + (this.minDelayInMilliseconds == null
                                ? 43
                                : this.minDelayInMilliseconds.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDelayInMilliseconds == null
                                ? 43
                                : this.maxDelayInMilliseconds.hashCode());
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
