import java.io.File

data class Folder(
    val name: String,
    val files: List<Files>,
    val folders: List<Folder>
)

data class Files(val name: String)

fun main() {
    val path = """C:\Users\Backflipt3\IdeaProjects\practice"""
    val structure = getPathStructure(File(path))
//    println(structure)
    display(structure, "")
}

fun getPathStructure(filePath: File): Folder {
    val (files, folders) = filePath.getFilesAndFolders()
    val subFiles = files.map { Files(it.name) }
    val subFolders = folders.drop(1).map { getPathStructure(it) }
    return Folder(files = subFiles, folders = subFolders, name = folders.first().name)
}

fun File.getFilesAndFolders(): Pair<List<File>, List<File>> {
    return this.walk().maxDepth(1).partition { it.isFile }
}

fun display(folder: Folder, prefix: String) {
    println(
        prefix + folder.name +
                if (folder.files.isEmpty()) {
                    " "
                } else {
                    folder.files.joinToString(prefix="\n" + prefix+"\t",separator = "\n" + prefix+"\t")
                }
    )
                folder.folders.map { display(it, "$prefix\t") }

}
