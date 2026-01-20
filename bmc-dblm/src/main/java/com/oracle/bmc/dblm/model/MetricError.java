/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Metric error content. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricError extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeGenerated",
        "errorType",
        "contentType",
        "data",
        "subject",
        "level"
    })
    public MetricError(
            java.util.Date timeGenerated,
            String errorType,
            String contentType,
            String data,
            String subject,
            String level) {
        super();
        this.timeGenerated = timeGenerated;
        this.errorType = errorType;
        this.contentType = contentType;
        this.data = data;
        this.subject = subject;
        this.level = level;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Time the error record was generated */
        @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
        private java.util.Date timeGenerated;

        /**
         * Time the error record was generated
         *
         * @param timeGenerated the value to set
         * @return this builder
         */
        public Builder timeGenerated(java.util.Date timeGenerated) {
            this.timeGenerated = timeGenerated;
            this.__explicitlySet__.add("timeGenerated");
            return this;
        }
        /** Error type */
        @com.fasterxml.jackson.annotation.JsonProperty("errorType")
        private String errorType;

        /**
         * Error type
         *
         * @param errorType the value to set
         * @return this builder
         */
        public Builder errorType(String errorType) {
            this.errorType = errorType;
            this.__explicitlySet__.add("errorType");
            return this;
        }
        /** Content type */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * Content type
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** Data */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * Data
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /** Subject */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * Subject
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /** Level */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private String level;

        /**
         * Level
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(String level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricError build() {
            MetricError model =
                    new MetricError(
                            this.timeGenerated,
                            this.errorType,
                            this.contentType,
                            this.data,
                            this.subject,
                            this.level);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricError model) {
            if (model.wasPropertyExplicitlySet("timeGenerated")) {
                this.timeGenerated(model.getTimeGenerated());
            }
            if (model.wasPropertyExplicitlySet("errorType")) {
                this.errorType(model.getErrorType());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
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

    /** Time the error record was generated */
    @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
    private final java.util.Date timeGenerated;

    /**
     * Time the error record was generated
     *
     * @return the value
     */
    public java.util.Date getTimeGenerated() {
        return timeGenerated;
    }

    /** Error type */
    @com.fasterxml.jackson.annotation.JsonProperty("errorType")
    private final String errorType;

    /**
     * Error type
     *
     * @return the value
     */
    public String getErrorType() {
        return errorType;
    }

    /** Content type */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * Content type
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** Data */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * Data
     *
     * @return the value
     */
    public String getData() {
        return data;
    }

    /** Subject */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * Subject
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
    }

    /** Level */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final String level;

    /**
     * Level
     *
     * @return the value
     */
    public String getLevel() {
        return level;
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
        sb.append("MetricError(");
        sb.append("super=").append(super.toString());
        sb.append("timeGenerated=").append(String.valueOf(this.timeGenerated));
        sb.append(", errorType=").append(String.valueOf(this.errorType));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricError)) {
            return false;
        }

        MetricError other = (MetricError) o;
        return java.util.Objects.equals(this.timeGenerated, other.timeGenerated)
                && java.util.Objects.equals(this.errorType, other.errorType)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.level, other.level)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeGenerated == null ? 43 : this.timeGenerated.hashCode());
        result = (result * PRIME) + (this.errorType == null ? 43 : this.errorType.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
