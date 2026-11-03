# InviZible Night

> ⚠️ This is a FORK of [InviZible Pro](https://github.com/Gedsh/InviZible).
> The original project is developed by Garmatin Oleksandr ([@Gedsh](https://github.com/Gedsh)).
> This fork is maintained independently and is not affiliated with the original author.
> Please report issues specific to this fork here, not to the original repository.

![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)

A custom build of InviZible Pro with a different Tor bridges source, updated I2P subscriptions, and a separate application ID so it can coexist with the original app.

## What's different in this fork

- Application ID: `com.yogannnn.invizible.night` — installs alongside the official InviZible Pro.
- App name: "InviZible Night".
- Tor bridges: uses vanilla bridges from bridges.torproject.org as the default source.
- I2P subscriptions: replaced notbob.i2p with inr.i2p.
- More changes may come. See commit history for details.

Note: This fork is built automatically via GitHub Actions from the `night` branch. Pre-built APKs are available in the Actions tab.

## Installation

1. Download the latest APK from the Actions tab (artifact `InviZible-Night-APK`).
2. Install it. Because the application ID is different, it will not conflict with the official InviZible Pro.
3. You can run both apps side by side.

## Building from source

Clone with submodules (required — the project uses android-filepicker):

    git clone --recursive https://github.com/yogannnn/InviZible-Night
    cd InviZible-Night
    git checkout night

Open in Android Studio (JDK 17, Android SDK 37, NDK 23.1.7779620).

To build a release APK:

    ./gradlew assembleFdroidUniversalRelease

Signing is configured via environment variables (KEYSTORE_PASSWORD, KEY_ALIAS, KEY_PASSWORD) and a release-key.jks file. For local builds you can also create a keystore.properties file in the project root.

## Original project

InviZible Pro combines the strengths of Tor, DNSCrypt, and Purple I2P to provide a comprehensive solution for online privacy, security, and anonymity.

- Original repository: https://github.com/Gedsh/InviZible
- Official site: https://invizible.net
- F-Droid: https://f-droid.org/packages/pan.alexander.tordnscrypt.stable/
- Google Play: https://play.google.com/store/apps/details?id=pan.alexander.tordnscrypt.gp

For documentation, wiki, and support, please refer to the original project.

## License

GNU General Public License version 3: https://www.gnu.org/licenses/gpl-3.0.txt

Original work: Copyright (c) 2019-2026 Garmatin Oleksandr <invizible.soft@gmail.com>

Modifications in this fork: Copyright (c) 2026 yogannnn

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.

## Attribution (from the original project)

InviZible Pro uses:

- DNSCrypt: https://github.com/jedisct1/dnscrypt-proxy
- Tor: https://www.torproject.org/
- Purple I2P: https://github.com/PurpleI2P/i2pd
- Chainfire/libsuperuser: https://github.com/Chainfire/libsuperuser
- jaredrummler/AndroidShell: https://github.com/jaredrummler/AndroidShell
- NetGuard: https://github.com/M66B/NetGuard
- Angads25/android-filepicker: https://github.com/Angads25/android-filepicker
- meefik/busybox: https://github.com/meefik/busybox

This product is produced independently from the Tor®, DNSCrypt, Purple I2P software and carries no guarantee from The Above Projects about quality, suitability or anything else.