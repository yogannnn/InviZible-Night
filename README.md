# InviZible Night

**An independent community fork of [InviZible
Pro](https://github.com/Gedsh/InviZible).**

> 🌙 **InviZible Night is an unofficial, independently maintained
> fork.**
>
> The original InviZible Pro project was created and is maintained by
> **Garmatin Oleksandr ([@Gedsh](https://github.com/Gedsh))**. This
> repository preserves that attribution and acknowledges the original
> project as the foundation of this fork.
>
> InviZible Night is not an official release of InviZible Pro. It is
> maintained separately and is not endorsed by, or affiliated with, the
> original author.

[![License: GPL v3 or
later](https://img.shields.io/badge/License-GPLv3%2B-blue.svg)](https://www.gnu.org/licenses/gpl-3.0.html)

## About this fork

InviZible Night exists because its maintainer wants to explore a
somewhat different set of defaults and source-selection policies while
continuing the work on the basis of InviZible Pro.

The differences described below are **technical and project-direction
choices**. They should not be read as a criticism of the original author
or as a claim that the original project is unsafe or improperly
maintained. The original author is entitled to make different choices
for the original application; this fork makes no claim to represent his
views.

### Current differences

-   **Separate application ID:** `com.yogannnn.invizible.night`.
    InviZible Night can be installed alongside the official InviZible
    Pro, subject to Android's normal package/signature rules.
-   **Separate app name:** `InviZible Night`.
-   **Tor bridges:** the current default source is [Tor Project's bridge
    distribution service](https://bridges.torproject.org/). This fork
    does not adopt a blanket rule that bridge information must only ever
    come from `torproject.org`: publicly available sources hosted on
    GitHub are not excluded as a matter of principle. Any additional
    source must actually be supported/configured in the relevant build;
    this statement does not mean that every GitHub bridge list is
    automatically trusted or enabled.
-   **I2P subscriptions:** this fork is configured to use `inr.i2p`
    instead of `notbob.i2p`.

### A note on source selection

The choice of bridge and subscription sources is one of the areas where
the maintainer's preferences differ from the preferences of the original
project.

For I2P subscriptions in particular, the maintainer has concerns about
the transparency of source-selection and content-filtering policies and
therefore prefers a different subscription source. This is a statement
of the maintainer's preference and rationale, **not a claim that
wrongdoing by the operators of `notbob.i2p` has been proven**.

Likewise, allowing for GitHub-hosted Tor bridge sources does not mean
that every such source is reliable. Sources should be assessed on their
provenance, maintenance, integrity, and suitability. Users should make
their own decisions about which sources they trust.

These choices are not presented as the only correct approach. They are
simply the direction taken by this independent fork.

## Relationship with the original project

-   **Original project:** [InviZible
    Pro](https://github.com/Gedsh/InviZible)
-   **Original author:** [Garmatin Oleksandr
    (@Gedsh)](https://github.com/Gedsh)
-   **Official website:** [invizible.net](https://invizible.net)

InviZible Pro combines Tor, DNSCrypt, and Purple I2P to provide privacy
and network-security tools. InviZible Night builds on that work, while
maintaining its own repository, build configuration, release artifacts,
and support channel.

Please report issues that are specific to InviZible Night in **this
repository**. For issues that also affect the original InviZible Pro, or
for help with the official application, please use the [original
repository](https://github.com/Gedsh/InviZible) and its support
channels.

Please do not direct users of the original application to this fork for
official support, and do not attribute changes or issues introduced by
this fork to the original author.

## Installation

1.  Open the [Actions
    tab](https://github.com/yogannnn/InviZible-Night/actions) in this
    repository.
2.  Select a successful workflow run for the `night` branch.
3.  Download the `InviZible-Night-APK` artifact.
4.  Install the APK on your Android device.

Because the fork uses a different application ID, it is designed to
coexist with the official InviZible Pro. Android may still require you
to allow installation from the source you use. Builds distributed here
are unofficial and are maintained independently from the original
project's releases.

## Building from source

Clone the repository, including its submodules (required by the project,
including `android-filepicker`):

``` bash
git clone --recursive https://github.com/yogannnn/InviZible-Night.git
cd InviZible-Night
git checkout night
```

Open the project in Android Studio. The current build setup uses:

-   JDK 17
-   Android SDK 37
-   NDK 23.1.7779620

To build the release APK:

``` bash
./gradlew assembleFdroidUniversalRelease
```

Signing is configured through the `KEYSTORE_PASSWORD`, `KEY_ALIAS`, and
`KEY_PASSWORD` environment variables and a `release-key.jks` file. For
local builds, a `keystore.properties` file can also be created in the
project root.

Build requirements and signing configuration may change as the fork
develops. Check the workflow files and Gradle configuration for the
exact settings used by a particular revision.

## License and copyright

InviZible Night is distributed under the **GNU General Public License,
version 3 or (at your option) any later version**, as stated by the
project licensing terms.

-   The original InviZible Pro code and contributions remain attributed
    to their respective copyright holders. Existing upstream copyright
    and license notices should be preserved.
-   Copyright in modifications made specifically for this fork: **© 2026
    yogannnn**, to the extent those modifications are copyrightable and
    owned by the maintainer.

This fork does not claim ownership of the original InviZible Pro code,
its name, or the work of its contributors.

The GPL permits redistribution and modification subject to its terms.
When distributing binaries, this project must also meet the applicable
GPL requirements for providing the corresponding source code and
preserving required notices.

See the [GNU GPL v3 text](https://www.gnu.org/licenses/gpl-3.0.html) and
the `LICENSE` file in this repository for the license terms.

## Third-party projects and components

InviZible Pro, and therefore this fork, uses or builds upon work from
other projects, including:

-   [DNSCrypt](https://github.com/DNSCrypt/dnscrypt-proxy)
-   [Tor](https://www.torproject.org/)
-   [Purple I2P / i2pd](https://github.com/PurpleI2P/i2pd)
-   [Chainfire/libsuperuser](https://github.com/Chainfire/libsuperuser)
-   [jaredrummler/AndroidShell](https://github.com/jaredrummler/AndroidShell)
-   [NetGuard](https://github.com/M66B/NetGuard)
-   [Angads25/android-filepicker](https://github.com/Angads25/android-filepicker)
-   [meefik/busybox](https://github.com/meefik/busybox)

This list is provided for attribution and orientation; it may not be
exhaustive. Each component remains subject to its own license and terms.
Please consult the relevant upstream repositories and the license/notice
files included with the source.

This product is produced independently from the Tor, DNSCrypt, and
Purple I2P projects. Those projects do not endorse this fork and make no
guarantees about its quality, suitability, or operation.

## Acknowledgement

Thank you to **Garmatin Oleksandr (@Gedsh)** and all contributors to
InviZible Pro and its dependencies. InviZible Night would not exist in
its current form without their work.

The purpose of this fork is not to erase, replace, or diminish that
work. It is to maintain an alternative build with a different set of
preferences and to make those differences visible to users.
