### Le projet consiste à créer une API pour permettre aux joueurs de Minecraft de communiquer en utilisant des channels. Cette API pourra être utilisée par les développeurs de plugins pour ajouter des fonctionnalités de chat avancées à leur serveur Minecraft.

### L'API permettra aux joueurs de créer et de rejoindre des channels de chat pour discuter avec d'autres joueurs dans un environnement virtuel. Les channels pourront être publics ou privés et les joueurs pourront être invités à rejoindre des channels privés.

### L'API offrira également des fonctionnalités de modération de chat, permettant aux administrateurs de serveurs de surveiller et de modérer les conversations dans les channels. Les fonctionnalités de modération incluront la possibilité de bloquer des joueurs, de supprimer des messages et d'afficher des avertissements aux joueurs qui enfreignent les règles du serveur.

### En outre, l'API sera conçue pour être facilement intégrée aux plugins existants, ce qui permettra aux développeurs de personnaliser et d'étendre les fonctionnalités de chat de leur plugin.

### Le projet sera développé en utilisant le langage de programmation Java et sera compatible avec les dernières versions de Minecraft. Le code source sera disponible sur GitHub, ce qui permettra aux développeurs de contribuer au projet et de proposer des améliorations et des corrections de bugs.

### En résumé, l'API de communication en channel pour Minecraft permettra aux joueurs de communiquer en utilisant des channels, offrira des fonctionnalités de modération de chat et sera facilement intégrable aux plugins existants.

Fini le : 05/07/2023


```
For maven

        <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

<dependencies>
    <dependency>
	    <groupId>com.github.Sandro642</groupId>
	    <artifactId>ChannelzAPI</artifactId>
	    <version>Tag</version>
	  </dependency>
</dependencies>

For Gradle

      allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

 dependencies {
	        implementation 'com.github.Sandro642:ChannelzAPI:Tag'
	}
```

Bug of API not resolved
