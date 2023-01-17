/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details for an error on an IPSec tunnel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnelErrorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IPSecConnectionTunnelErrorDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "errorCode",
        "errorDescription",
        "solution",
        "ociResourcesLink",
        "timestamp"
    })
    public IPSecConnectionTunnelErrorDetails(
            String id,
            String errorCode,
            String errorDescription,
            String solution,
            String ociResourcesLink,
            java.util.Date timestamp) {
        super();
        this.id = id;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.solution = solution;
        this.ociResourcesLink = ociResourcesLink;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique ID generated for each error report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique ID generated for each error report.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique code describes the error type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        /**
         * Unique code describes the error type.
         * @param errorCode the value to set
         * @return this builder
         **/
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /**
         * A detailed description of the error.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
        private String errorDescription;

        /**
         * A detailed description of the error.
         * @param errorDescription the value to set
         * @return this builder
         **/
        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            this.__explicitlySet__.add("errorDescription");
            return this;
        }
        /**
         * Resolution for the error.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("solution")
        private String solution;

        /**
         * Resolution for the error.
         * @param solution the value to set
         * @return this builder
         **/
        public Builder solution(String solution) {
            this.solution = solution;
            this.__explicitlySet__.add("solution");
            return this;
        }
        /**
         * Link to more Oracle resources or relevant documentation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociResourcesLink")
        private String ociResourcesLink;

        /**
         * Link to more Oracle resources or relevant documentation.
         * @param ociResourcesLink the value to set
         * @return this builder
         **/
        public Builder ociResourcesLink(String ociResourcesLink) {
            this.ociResourcesLink = ociResourcesLink;
            this.__explicitlySet__.add("ociResourcesLink");
            return this;
        }
        /**
         * Timestamp when the error occurred.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Timestamp when the error occurred.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnelErrorDetails build() {
            IPSecConnectionTunnelErrorDetails model =
                    new IPSecConnectionTunnelErrorDetails(
                            this.id,
                            this.errorCode,
                            this.errorDescription,
                            this.solution,
                            this.ociResourcesLink,
                            this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnelErrorDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorDescription")) {
                this.errorDescription(model.getErrorDescription());
            }
            if (model.wasPropertyExplicitlySet("solution")) {
                this.solution(model.getSolution());
            }
            if (model.wasPropertyExplicitlySet("ociResourcesLink")) {
                this.ociResourcesLink(model.getOciResourcesLink());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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
     * Unique ID generated for each error report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique ID generated for each error report.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique code describes the error type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    /**
     * Unique code describes the error type.
     * @return the value
     **/
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * A detailed description of the error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
    private final String errorDescription;

    /**
     * A detailed description of the error.
     * @return the value
     **/
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Resolution for the error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solution")
    private final String solution;

    /**
     * Resolution for the error.
     * @return the value
     **/
    public String getSolution() {
        return solution;
    }

    /**
     * Link to more Oracle resources or relevant documentation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociResourcesLink")
    private final String ociResourcesLink;

    /**
     * Link to more Oracle resources or relevant documentation.
     * @return the value
     **/
    public String getOciResourcesLink() {
        return ociResourcesLink;
    }

    /**
     * Timestamp when the error occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Timestamp when the error occurred.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("IPSecConnectionTunnelErrorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorDescription=").append(String.valueOf(this.errorDescription));
        sb.append(", solution=").append(String.valueOf(this.solution));
        sb.append(", ociResourcesLink=").append(String.valueOf(this.ociResourcesLink));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IPSecConnectionTunnelErrorDetails)) {
            return false;
        }

        IPSecConnectionTunnelErrorDetails other = (IPSecConnectionTunnelErrorDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorDescription, other.errorDescription)
                && java.util.Objects.equals(this.solution, other.solution)
                && java.util.Objects.equals(this.ociResourcesLink, other.ociResourcesLink)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result =
                (result * PRIME)
                        + (this.errorDescription == null ? 43 : this.errorDescription.hashCode());
        result = (result * PRIME) + (this.solution == null ? 43 : this.solution.hashCode());
        result =
                (result * PRIME)
                        + (this.ociResourcesLink == null ? 43 : this.ociResourcesLink.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
