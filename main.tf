terraform {

  required_providers {
    local = {
      source  = "hashicorp/local"
      version = "2.5.1"
    }
  }
}

provider "local" {}

data "local_file" "readme" {
  filename = "README.md"
}

output "file_path" {
  value = data.local_file.readme.filename
}

output "file_content" {
  value = data.local_file.readme.content
}

