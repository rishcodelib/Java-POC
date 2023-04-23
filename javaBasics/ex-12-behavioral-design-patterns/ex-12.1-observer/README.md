## Behavioral : Observer Design Pattern

## Folder Structure

> Observer Design Pattern, has 2 parts *OBSERVER* and *OBSERVABLE*, *OBSERVER* observes the *OBSERVABLE* and performs activities.

## Example: 

> In Youtube where we have a [Channel] as *OBSERVABLE* and subscriber as *OBSERVER*. where [subscriber] observers the channel when new content / videos are getting uploaded. 



- `src`: the folder to maintain sources
  > `com.aggarwal.main`: contains the main method
  > `com.aggarwal.channel` : contains the Observable Classes & Interface 
  > `com.aggarwal.subscriber` : contains the Observer Classes & Interface. 

- `lib`: the folder to maintain dependencies
Meanwhile, the compiled output files will be generated in the `bin` folder by default.


## VS Code Details:
> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
