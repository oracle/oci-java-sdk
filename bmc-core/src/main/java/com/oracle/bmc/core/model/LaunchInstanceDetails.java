/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = LaunchInstanceDetails.Builder.class)
public class LaunchInstanceDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @JsonProperty("imageId")
        private String imageId;

        @JsonProperty("ipxeScript")
        private String ipxeScript;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        @JsonProperty("shape")
        private String shape;

        @JsonProperty("subnetId")
        private String subnetId;

        public LaunchInstanceDetails build() {
            return new LaunchInstanceDetails(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    hostnameLabel,
                    imageId,
                    ipxeScript,
                    metadata,
                    shape,
                    subnetId);
        }

        @JsonIgnore
        public Builder copy(LaunchInstanceDetails o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .hostnameLabel(o.getHostnameLabel())
                    .imageId(o.getImageId())
                    .ipxeScript(o.getIpxeScript())
                    .metadata(o.getMetadata())
                    .shape(o.getShape())
                    .subnetId(o.getSubnetId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain of the instance.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: `My bare metal instance`
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The hostname for the VNIC that is created during instance launch.
     * Used for DNS. The value is the hostname portion of the instance's
     * fully qualified domain name (FQDN) (e.g., `bminstance-1` in FQDN
     * `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * The value cannot be changed, and it can be retrieved from the
     * {@link Vnic}.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `bminstance-1`
     *
     **/
    @JsonProperty("hostnameLabel")
    @Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * The OCID of the image used to boot the instance.
     **/
    @JsonProperty("imageId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String imageId;

    /**
     * This is an advanced option.
     * <p>
     * When an Oracle Bare Metal Cloud Services or virtual machine
     * instance boots, the iPXE firmware that runs on the instance is
     * configured to run an iPXE script to continue the boot process.
     * <p>
     * If you want more control over the boot process, you can provide
     * your own custom iPXE script that will run when the instance boots;
     * however, you should be aware that the same iPXE script will run
     * every time an instance boots; not only after the initial
     * LaunchInstance call.
     * <p>
     * The default iPXE script connects to the instance\u2019s local boot
     * volume over iSCSI and performs a network boot. If you use a custom iPXE
     * script and want to network-boot from the instance\u2019s local boot volume
     * over iSCSI the same way as the default iPXE script, you should use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     * <p>
     * For more information about the Bring Your Own Image feature of
     * Oracle Bare Metal Cloud Services, see
     * [Bring Your Own Image](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     **/
    @JsonProperty("ipxeScript")
    @Size(min = 1, max = 10240)
    String ipxeScript;

    /**
     * Custom metadata key/value pairs that you provide, such as the SSH public key
     * required to connect to the instance.
     * <p>
     * A metadata service runs on every launched instance. The service is an HTTP
     * endpoint listening on 169.254.169.254. You can use the service to:
     * <p>
     * Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/)
     *   to be used for various system initialization tasks.
     * <p>
     * Get information about the instance, including the custom metadata that you
     *   provide when you launch the instance.
     * <p>
     * __Providing Cloud-Init Metadata__
     * <p>
     * You can use the following metadata key names to provide information to
     *  Cloud-Init:
     * <p>
     * __\"ssh_authorized_keys\"__ - Provide one or more public SSH keys to be
     *  included in the `~/.ssh/authorized_keys` file for the default user on the
     *  instance. Use a newline character to separate multiple keys. The SSH
     *  keys must be in the format necessary for the `authorized_keys` file, as shown
     *  in the example below.
     * <p>
     * __\"user_data\"__ - Provide your own base64-encoded data to be used by
     *  Cloud-Init to run custom scripts or provide custom Cloud-Init configuration. For
     *  information about how to take advantage of user data, see the
     *  [Cloud-Init Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     * <p>
     * __Note:__ Cloud-Init does not pull this data from the `http://169.254.169.254/opc/v1/instance/metadata/`
     *  path. When the instance launches and either of these keys are provided, the key values are formatted as
     *  OpenStack metadata and copied to the following locations, which are recognized by Cloud-Init:
     * <p>
     * `http://169.254.169.254/openstack/latest/meta_data.json` - This JSON blob
     *  contains, among other things, the SSH keys that you provided for
     *   __\"ssh_authorized_keys\"__.
     * <p>
     * `http://169.254.169.254/openstack/latest/user_data` - Contains the
     *  base64-decoded data that you provided for __\"user_data\"__.
     * <p>
     * __Metadata Example__
     * <p>
     * \"metadata\" : {
     *          \"quake_bot_level\" : \"Severe\",
     *          \"ssh_authorized_keys\" : \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCZ06fccNTQfq+xubFlJ5ZR3kt+uzspdH9tXL+lAejSM1NXM+CFZev7MIxfEjas06y80ZBZ7DUTQO0GxJPeD8NCOb1VorF8M4xuLwrmzRtkoZzU16umt4y1W0Q4ifdp3IiiU0U8/WxczSXcUVZOLqkz5dc6oMHdMVpkimietWzGZ4LBBsH/LjEVY7E0V+a0sNchlVDIZcm7ErReBLcdTGDq0uLBiuChyl6RUkX1PNhusquTGwK7zc8OBXkRuubn5UKXhI3Ul9Nyk4XESkVWIGNKmw8mSpoJSjR8P9ZjRmcZVo8S+x4KVPMZKQEor== ryan.smith@company.com
     *          ssh-rsa AAAAB3NzaC1yc2EAAAABJQAAAQEAzJSAtwEPoB3Jmr58IXrDGzLuDYkWAYg8AsLYlo6JZvKpjY1xednIcfEVQJm4T2DhVmdWhRrwQ8DmayVZvBkLt+zs2LdoAJEVimKwXcJFD/7wtH8Lnk17HiglbbbNXsemjDY0hea4JUE5CfvkIdZBITuMrfqSmA4n3VNoorXYdvtTMoGG8fxMub46RPtuxtqi9bG9Zqenordkg5FJt2mVNfQRqf83CWojcOkklUWq4CjyxaeLf5i9gv1fRoBo4QhiA8I6NCSppO8GnoV/6Ox6TNoh9BiifqGKC9VGYuC89RvUajRBTZSK2TK4DPfaT+2R+slPsFrwiT/oPEhhEK1S5Q== rsa-key-20160227\",
     *          \"user_data\" : \"SWYgeW91IGNhbiBzZWUgdGhpcywgdGhlbiBpdCB3b3JrZWQgbWF5YmUuCg==\"
     *       }
     *  __Getting Metadata on the Instance__
     * <p>
     * To get information about your instance, connect to the instance using SSH and issue any of the
     *  following GET requests:
     * <p>
     * curl http://169.254.169.254/opc/v1/instance/
     *      curl http://169.254.169.254/opc/v1/instance/metadata/
     *      curl http://169.254.169.254/opc/v1/instance/metadata/<any-key-name>
     * <p>
     * You'll get back a response that includes all the instance information; only the metadata information; or
     *  the metadata information for the specified key name, respectively.
     *
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @JsonProperty("shape")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String shape;

    /**
     * The OCID of the subnet.
     **/
    @JsonProperty("subnetId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String subnetId;
}
