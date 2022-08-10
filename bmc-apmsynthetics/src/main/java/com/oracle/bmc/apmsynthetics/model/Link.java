/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * link between 2 nodes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Link.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Link extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "source",
        "destination",
        "repeatCount",
        "forwardingLoss",
        "delayInMilliseconds",
        "minDelayInMilliseconds",
        "maxDelayInMilliseconds"
    })
    public Link(
            String id,
            String source,
            String destination,
            Integer repeatCount,
            Double forwardingLoss,
            Double delayInMilliseconds,
            Double minDelayInMilliseconds,
            Double maxDelayInMilliseconds) {
        super();
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.repeatCount = repeatCount;
        this.forwardingLoss = forwardingLoss;
        this.delayInMilliseconds = delayInMilliseconds;
        this.minDelayInMilliseconds = minDelayInMilliseconds;
        this.maxDelayInMilliseconds = maxDelayInMilliseconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of Link
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of Link
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * source node id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * source node id
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * destination node id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * destination node id
         * @param destination the value to set
         * @return this builder
         **/
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * number of times this link is repeated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
        private Integer repeatCount;

        /**
         * number of times this link is repeated
         * @param repeatCount the value to set
         * @return this builder
         **/
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            this.__explicitlySet__.add("repeatCount");
            return this;
        }
        /**
         * average packet loss
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("forwardingLoss")
        private Double forwardingLoss;

        /**
         * average packet loss
         * @param forwardingLoss the value to set
         * @return this builder
         **/
        public Builder forwardingLoss(Double forwardingLoss) {
            this.forwardingLoss = forwardingLoss;
            this.__explicitlySet__.add("forwardingLoss");
            return this;
        }
        /**
         * difference of packet response time between source and destination in milliseconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("delayInMilliseconds")
        private Double delayInMilliseconds;

        /**
         * difference of packet response time between source and destination in milliseconds
         * @param delayInMilliseconds the value to set
         * @return this builder
         **/
        public Builder delayInMilliseconds(Double delayInMilliseconds) {
            this.delayInMilliseconds = delayInMilliseconds;
            this.__explicitlySet__.add("delayInMilliseconds");
            return this;
        }
        /**
         * minimum delay in milliseconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minDelayInMilliseconds")
        private Double minDelayInMilliseconds;

        /**
         * minimum delay in milliseconds
         * @param minDelayInMilliseconds the value to set
         * @return this builder
         **/
        public Builder minDelayInMilliseconds(Double minDelayInMilliseconds) {
            this.minDelayInMilliseconds = minDelayInMilliseconds;
            this.__explicitlySet__.add("minDelayInMilliseconds");
            return this;
        }
        /**
         * maximum delay in milliseconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDelayInMilliseconds")
        private Double maxDelayInMilliseconds;

        /**
         * maximum delay in milliseconds
         * @param maxDelayInMilliseconds the value to set
         * @return this builder
         **/
        public Builder maxDelayInMilliseconds(Double maxDelayInMilliseconds) {
            this.maxDelayInMilliseconds = maxDelayInMilliseconds;
            this.__explicitlySet__.add("maxDelayInMilliseconds");
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
                            this.maxDelayInMilliseconds);
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
     * id of Link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of Link
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * source node id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * source node id
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * destination node id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * destination node id
     * @return the value
     **/
    public String getDestination() {
        return destination;
    }

    /**
     * number of times this link is repeated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
    private final Integer repeatCount;

    /**
     * number of times this link is repeated
     * @return the value
     **/
    public Integer getRepeatCount() {
        return repeatCount;
    }

    /**
     * average packet loss
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forwardingLoss")
    private final Double forwardingLoss;

    /**
     * average packet loss
     * @return the value
     **/
    public Double getForwardingLoss() {
        return forwardingLoss;
    }

    /**
     * difference of packet response time between source and destination in milliseconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delayInMilliseconds")
    private final Double delayInMilliseconds;

    /**
     * difference of packet response time between source and destination in milliseconds
     * @return the value
     **/
    public Double getDelayInMilliseconds() {
        return delayInMilliseconds;
    }

    /**
     * minimum delay in milliseconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minDelayInMilliseconds")
    private final Double minDelayInMilliseconds;

    /**
     * minimum delay in milliseconds
     * @return the value
     **/
    public Double getMinDelayInMilliseconds() {
        return minDelayInMilliseconds;
    }

    /**
     * maximum delay in milliseconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDelayInMilliseconds")
    private final Double maxDelayInMilliseconds;

    /**
     * maximum delay in milliseconds
     * @return the value
     **/
    public Double getMaxDelayInMilliseconds() {
        return maxDelayInMilliseconds;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
