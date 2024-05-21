/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Certificates.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "lifecycleState",
        "subject",
        "isSelfSigned",
        "timeValidTo",
        "timeCreated"
    })
    public CertificateSummary(
            String key,
            CertificateLifecycleState lifecycleState,
            String subject,
            Boolean isSelfSigned,
            java.util.Date timeValidTo,
            java.util.Date timeCreated) {
        super();
        this.key = key;
        this.lifecycleState = lifecycleState;
        this.subject = subject;
        this.isSelfSigned = isSelfSigned;
        this.timeValidTo = timeValidTo;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being referenced.
         * It must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being referenced.
         * It must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Possible certificate lifecycle states.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CertificateLifecycleState lifecycleState;

        /**
         * Possible certificate lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(CertificateLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The Certificate subject.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * The Certificate subject.
         *
         * @param subject the value to set
         * @return this builder
         **/
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /**
         * Indicates if the certificate is self signed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSelfSigned")
        private Boolean isSelfSigned;

        /**
         * Indicates if the certificate is self signed.
         *
         * @param isSelfSigned the value to set
         * @return this builder
         **/
        public Builder isSelfSigned(Boolean isSelfSigned) {
            this.isSelfSigned = isSelfSigned;
            this.__explicitlySet__.add("isSelfSigned");
            return this;
        }
        /**
         * The time the certificate is valid to. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
        private java.util.Date timeValidTo;

        /**
         * The time the certificate is valid to. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeValidTo the value to set
         * @return this builder
         **/
        public Builder timeValidTo(java.util.Date timeValidTo) {
            this.timeValidTo = timeValidTo;
            this.__explicitlySet__.add("timeValidTo");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateSummary build() {
            CertificateSummary model =
                    new CertificateSummary(
                            this.key,
                            this.lifecycleState,
                            this.subject,
                            this.isSelfSigned,
                            this.timeValidTo,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("isSelfSigned")) {
                this.isSelfSigned(model.getIsSelfSigned());
            }
            if (model.wasPropertyExplicitlySet("timeValidTo")) {
                this.timeValidTo(model.getTimeValidTo());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The identifier key (unique name in the scope of the deployment) of the certificate being referenced.
     * It must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The identifier key (unique name in the scope of the deployment) of the certificate being referenced.
     * It must be 1 to 32 characters long, must contain only alphanumeric characters and must start with a letter.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Possible certificate lifecycle states.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CertificateLifecycleState lifecycleState;

    /**
     * Possible certificate lifecycle states.
     *
     * @return the value
     **/
    public CertificateLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The Certificate subject.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * The Certificate subject.
     *
     * @return the value
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * Indicates if the certificate is self signed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSelfSigned")
    private final Boolean isSelfSigned;

    /**
     * Indicates if the certificate is self signed.
     *
     * @return the value
     **/
    public Boolean getIsSelfSigned() {
        return isSelfSigned;
    }

    /**
     * The time the certificate is valid to. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
    private final java.util.Date timeValidTo;

    /**
     * The time the certificate is valid to. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeValidTo() {
        return timeValidTo;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("CertificateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", isSelfSigned=").append(String.valueOf(this.isSelfSigned));
        sb.append(", timeValidTo=").append(String.valueOf(this.timeValidTo));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateSummary)) {
            return false;
        }

        CertificateSummary other = (CertificateSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.isSelfSigned, other.isSelfSigned)
                && java.util.Objects.equals(this.timeValidTo, other.timeValidTo)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + (this.isSelfSigned == null ? 43 : this.isSelfSigned.hashCode());
        result = (result * PRIME) + (this.timeValidTo == null ? 43 : this.timeValidTo.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
