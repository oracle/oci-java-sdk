/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The TLS certificate in case of a TLS connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmCertificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmCertificate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "comment",
        "content",
        "certificateDescription",
        "id",
        "name",
        "organization",
        "subject"
    })
    public OlvmCertificate(
            String comment,
            String content,
            String certificateDescription,
            String id,
            String name,
            String organization,
            String subject) {
        super();
        this.comment = comment;
        this.content = content;
        this.certificateDescription = certificateDescription;
        this.id = id;
        this.name = name;
        this.organization = organization;
        this.subject = subject;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** Content of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * Content of the certificate.
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** A human-readable description in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateDescription")
        private String certificateDescription;

        /**
         * A human-readable description in plain text.
         *
         * @param certificateDescription the value to set
         * @return this builder
         */
        public Builder certificateDescription(String certificateDescription) {
            this.certificateDescription = certificateDescription;
            this.__explicitlySet__.add("certificateDescription");
            return this;
        }
        /** A unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A human-readable name in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A human-readable name in plain text.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Organization of the certificate */
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private String organization;

        /**
         * Organization of the certificate
         *
         * @param organization the value to set
         * @return this builder
         */
        public Builder organization(String organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }
        /** Subject of the certificate */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * Subject of the certificate
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmCertificate build() {
            OlvmCertificate model =
                    new OlvmCertificate(
                            this.comment,
                            this.content,
                            this.certificateDescription,
                            this.id,
                            this.name,
                            this.organization,
                            this.subject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmCertificate model) {
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("certificateDescription")) {
                this.certificateDescription(model.getCertificateDescription());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("organization")) {
                this.organization(model.getOrganization());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
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

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** Content of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * Content of the certificate.
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /** A human-readable description in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateDescription")
    private final String certificateDescription;

    /**
     * A human-readable description in plain text.
     *
     * @return the value
     */
    public String getCertificateDescription() {
        return certificateDescription;
    }

    /** A unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A human-readable name in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A human-readable name in plain text.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Organization of the certificate */
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

    /**
     * Organization of the certificate
     *
     * @return the value
     */
    public String getOrganization() {
        return organization;
    }

    /** Subject of the certificate */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * Subject of the certificate
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
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
        sb.append("OlvmCertificate(");
        sb.append("super=").append(super.toString());
        sb.append("comment=").append(String.valueOf(this.comment));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", certificateDescription=").append(String.valueOf(this.certificateDescription));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", organization=").append(String.valueOf(this.organization));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmCertificate)) {
            return false;
        }

        OlvmCertificate other = (OlvmCertificate) o;
        return java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(
                        this.certificateDescription, other.certificateDescription)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.organization, other.organization)
                && java.util.Objects.equals(this.subject, other.subject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateDescription == null
                                ? 43
                                : this.certificateDescription.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
