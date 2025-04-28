# About this package

This package provides Privacy Enhanced Mail (PEM) file parsing for
private keys, public keys and certificates.

It provides this functionality using APIs provided by the base JDK libraries
*only*. It does *not* depend on any external libraries such as Bouncy Castle
or Jipher.

The table below provides an overview of the capabilities of this package:

| PEM Artefact                    | Read | Write |
|---------------------------------|------|-------|
| PKCS1 Public Key                | ✅    | ✅     |
| PKCS1 Private Key - Unencrypted | ✅    | ✅     |
| PKCS1 Private Key - Encrypted   | ✅    | ✅     |
| X509 Public Key                 | ✅    | ✅     |
| X509 Certificate                | ✅    | ✅     |
| X509 Certificate Chain          | ✅    | ✅     |
| PKCS8 Private Key - Unencrypted | ✅    | ✅     |
| PKCS8 Private Key - Encrypted   | ✅    | ❌     |

Support for writing encrypted PKCS8 Private Keys could be added, with
additional effort, but no use-case for this has been observed for this in
the current code-base, so this has been left as future work.

## Supported encryption algorithms

- PKCS1 supports RSA public keys and private keys only.
- This package only supports AES encryption for encrypted PKCS1 private keys
  (in 128, 192 or 256 bit key sizes)
- Encrypted PKCS1 private keys using a bespoke PBE algorithm. This package
  only supports the MD5 based version of this algorithm. MD5 is *not* FIPS
  compliant, thus encrypted PKCS1 private keys must not be used in FIPS
  compliant environments.
- PKCS8 private keys (and X509 public keys) support multiple asymmetric
  encryption algorithms, however the test suites in oci-java-sdk only
  use RSA encryption, so only RSA has been tested, support for other
  algorithms has not been verified.

## About the API

The API is exposed via a top level type named `Pem`.

Clients use `Pem.decoder()` -returning an instance of
`Pem.Decoder`- to read PEM resources, and `Pem.encoder()`- returning an instance
of `Pem.Encoder`- to write PEM resources.

In this regard the API is similar in design to the `java.util.Base64` API.

Clients can use the various `with()` methods on these types to customize
how the resources are read or written.

For example to read an encrypted private key a client could do:

```java
import com.oracle.bmc.http.client.pki.Pem;

import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.security.PrivateKey;

class Example {

  PrivateKey readPrivateKey(Path path, char[] passphrase) {
    try (ReadableByteChannel pem = Files.newByteChannel(path)) {
      return Pem.decoder()
              .with(passphrase)
              .decodePrivateKey(pem);
    }
  }
}
```

or to write an encrypted private key in PKCS1 format:

```java
import com.oracle.bmc.http.client.pki.Pem;

import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.security.PrivateKey;

class Example {

  PrivateKey writePkcs1PrivateKey(Path path, PrivateKey privateKey, char[] passphrase) {
    try (WritableByteChannel pem = Files.newByteChannel(path)) {
      return Pem.encoder()
              .with(Pem.Format.LEGACY)
              .with(passphrase)
              .write(pem, privateKey);
    }
  }
}
```

### Handling sensitive data

PEM resources are inherently text based resources, so APIs
that accept and consume `String` instances are the most intuitive,
and this is the case for APIs for reading and writing certificates and
public keys (which do not contain sensitive data).

Private keys are extremely sensitive data. Using `String` based APIs
with private keys is never appropriate because the immutable
nature of `String` means that the sensitive private key data cannot be erased
from memory after use.

All private key based APIs use `byte[]` inputs and outputs. Clients
*must* take care to erase all `byte[]` instances after use.

Alternatively `ReadableByteChannel` and `WritableByteChannel` APIs
are offered which may avoid materializing the private key data into (visible)
buffers altogether.

